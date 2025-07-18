package com.afriasdev.dds.repository;

import com.afriasdev.dds.model.SolicitudSangre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolicitudSangreRepository extends JpaRepository<SolicitudSangre, Long> {

    List<SolicitudSangre> findBySolicitanteId(Long id);

}
