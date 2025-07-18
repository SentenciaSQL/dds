package com.afriasdev.dds.controller;

import com.afriasdev.dds.model.Usuario;
import com.afriasdev.dds.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import static com.afriasdev.dds.utils.Utils.getResponseEntity;

@RestController
@RequestMapping("/api/v1/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<?> listar() {
        try {
            return ResponseEntity.ok(usuarioService.listar());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al listar usuarios: " + e.getMessage());
        }
    }

    @PostMapping("/registro")
    public ResponseEntity<?> registrar(@Valid @RequestBody Usuario usuario, BindingResult result) {
        ResponseEntity<?> errors = validation(result);
        if (errors != null) return errors;
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.registrar(usuario));
    }

    @DeleteMapping
    public ResponseEntity<?> eliminar(@RequestParam Long id) {
        try {
            usuarioService.eliminar(id);
            return ResponseEntity.ok("Usuario eliminado correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al eliminar usuario: " + e.getMessage());
        }
    }

    private ResponseEntity<?> validation(BindingResult result) {
        return getResponseEntity(result);
    }

}
