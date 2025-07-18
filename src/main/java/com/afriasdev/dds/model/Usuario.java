package com.afriasdev.dds.model;

import com.afriasdev.dds.model.enums.Rol;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "usuarios")
public class Usuario {

    @Id
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 100)
    @Column(length = 100)
    @NotBlank
    private String nombre;

    @Size(max = 100)
    @Column(length = 100)
    @NotBlank
    private String apellido;

    @Size(max = 100)
    @Column(length = 100, unique = true)
    @NotEmpty
    @Email
    private String email;

    @Size(min = 4, max = 20)
    @NotBlank
    @Column(length = 50, unique = true)
    private String username;

    @Size(max = 255)
    private String password;

    private String telefono;
    private String direccion;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    private boolean activo = true;

    @Column(name = "fecha_registro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaRegistro = LocalDateTime.now();

    private LocalDate fechaNacimiento;

    @Pattern(regexp = "^[MF]$", message = "El sexo debe ser 'M' o 'F'")
    @Column(length = 1)
    private String sexo;
}
