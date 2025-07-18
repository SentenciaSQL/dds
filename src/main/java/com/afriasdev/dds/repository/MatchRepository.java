package com.afriasdev.dds.repository;

import com.afriasdev.dds.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRepository extends JpaRepository<Match, Long> {

    List<Match> findBySolicitudId(Long solicitudId);

}
