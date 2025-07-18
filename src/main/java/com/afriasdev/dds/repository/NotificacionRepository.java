package com.afriasdev.dds.repository;

import com.afriasdev.dds.model.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {

    List<Notificacion> findByUsuarioIdAndLeidoFalse(Long usuarioId);

}
