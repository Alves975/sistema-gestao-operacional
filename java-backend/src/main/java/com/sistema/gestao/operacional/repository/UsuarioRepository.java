package com.sistema.gestao.operacional.repository;

import com.sistema.gestao.operacional.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    long countByRole(String role);   // ADMIN / OPERADOR
}
