package com.sistema.gestao.operacional.repository;

import com.sistema.gestao.operacional.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {

    // Quantos logs foram gerados HOJE (MySQL)
    @Query(
        value = "SELECT COUNT(*) FROM logs WHERE DATE(timestamp) = CURRENT_DATE",
        nativeQuery = true
    )
    long countLogsHoje();

    // Quantos logs foram gerados nos últimos 7 dias
    @Query(
        value = "SELECT COUNT(*) FROM logs WHERE timestamp >= NOW() - INTERVAL 7 DAY",
        nativeQuery = true
    )
    long countLogsSemana();

    // Buscar logs por ID do usuário
    List<Log> findByUsuarioId(Long usuarioId);
}
