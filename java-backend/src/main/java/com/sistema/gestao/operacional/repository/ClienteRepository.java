package com.sistema.gestao.operacional.repository;

import com.sistema.gestao.operacional.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    long countByStatus(String status);  // ATIVO / INATIVO
}
