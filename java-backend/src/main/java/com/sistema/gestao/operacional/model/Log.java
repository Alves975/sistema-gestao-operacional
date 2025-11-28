package com.sistema.gestao.operacional.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "logs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Log {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String acao;
    private LocalDateTime timestamp;

    @ManyToOne
    private Usuario usuario;

    public Log(String acao, LocalDateTime timestamp, Usuario usuario) {
        this.acao = acao;
        this.timestamp = timestamp;
        this.usuario = usuario;
    }
}
