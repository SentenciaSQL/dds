package com.afriasdev.dds.repository;

import com.afriasdev.dds.model.Donante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonanteRepository extends JpaRepository<Donante, Long> {

    List<Donante> findByTipoSangreAndDisponibleTrue(String tipoSangre);

}
