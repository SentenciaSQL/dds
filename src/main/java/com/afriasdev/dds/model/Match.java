package com.afriasdev.dds.model;

import com.afriasdev.dds.model.enums.EstadoMatch;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private SolicitudSangre solicitud;

    @ManyToOne
    private Usuario donante;

    private Double distanciaKm;

    @Enumerated(EnumType.STRING)
    private EstadoMatch estado;
}
