package com.afriasdev.dds.repository;

import com.afriasdev.dds.model.InventarioBancoSangre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventarioBancoSangreRepository extends JpaRepository<InventarioBancoSangre, Long> {

    List<InventarioBancoSangre> findByBancoId(Long bancoId);

}
