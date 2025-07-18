package com.afriasdev.dds.model;

import com.afriasdev.dds.model.enums.TipoSangre;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "inventario_banco_sangre")
public class InventarioBancoSangre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private BancoSangre banco;

    @Enumerated(EnumType.STRING)
    private TipoSangre tipoSangre;

    private Integer cantidadUnidades;
    private LocalDateTime fechaVencimiento;
}
