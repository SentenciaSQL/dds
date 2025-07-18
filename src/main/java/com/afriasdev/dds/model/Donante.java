package com.afriasdev.dds.model;

import com.afriasdev.dds.model.enums.TipoSangre;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "donantes")
public class Donante {

    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    private TipoSangre tipoSangre;

    private LocalDate ultimaDonacion;
    private boolean disponible;
    private Double latitud;
    private Double longitud;

}
