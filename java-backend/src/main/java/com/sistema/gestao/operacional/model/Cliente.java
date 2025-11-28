package com.sistema.gestao.operacional.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String cnpj;

    @Column(unique = true)
    private String cpf;

    private String telefone;

    private String status;  // ATIVO / INATIVO

    private LocalDateTime dataCriacao = LocalDateTime.now();

    public Cliente(String nome, String cnpj, String cpf, String telefone, String status) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.telefone = telefone;
        this.status = status;
    }
    
}
