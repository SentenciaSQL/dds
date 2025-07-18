package com.afriasdev.dds.model;

import com.afriasdev.dds.model.enums.EstadoSolicitud;
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
@Table(name = "solicitud_sangre")
public class SolicitudSangre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario solicitante;

    @Enumerated(EnumType.STRING)
    private TipoSangre tipoSangreRequerido;

    private LocalDateTime fechaSolicitud;

    @Enumerated(EnumType.STRING)
    private EstadoSolicitud estadoSolicitud;

    private Double latitud;
    private Double longitud;
    private String notas;
}
