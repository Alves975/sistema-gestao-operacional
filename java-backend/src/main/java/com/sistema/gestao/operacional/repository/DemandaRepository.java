package com.sistema.gestao.operacional.repository;

import com.sistema.gestao.operacional.model.Demanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface DemandaRepository extends JpaRepository<Demanda, Long> {

    long countByStatus(String status);  // ABERTA / EM_ANDAMENTO / CONCLUIDA

    @Query("SELECT COUNT(d) FROM Demanda d WHERE d.prazo < CURRENT_DATE AND d.status <> 'CONCLUIDA'")
    long countAtrasadas();
}
