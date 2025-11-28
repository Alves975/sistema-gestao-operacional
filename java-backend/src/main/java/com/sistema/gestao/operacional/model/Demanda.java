package com.sistema.gestao.operacional.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "demandas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Demanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String titulo;

    private String descricao;

    // ABERTA / EM_ANDAMENTO / CONCLUIDA
    private String status;

    private LocalDate prazo;

    // BAIXA / MEDIA / ALTA
    private String prioridade;

    private LocalDate dataCriacao = LocalDate.now();

    private LocalDate dataConclusao;

    public Demanda(String titulo, String descricao, String status, LocalDate prazo, String prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }
}
