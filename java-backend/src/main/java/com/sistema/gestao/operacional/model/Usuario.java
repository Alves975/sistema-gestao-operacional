package com.sistema.gestao.operacional.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")  // <-- AQUI!
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;
    private String role;   // ADMIN / OPERADOR
    private String status; // ATIVO / INATIVO

    private LocalDateTime dataCriacao = LocalDateTime.now();

    public Usuario(String username, String email, String password, String role, String status) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
    }
}
