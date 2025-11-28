package com.sistema.gestao.operacional.service;

import com.sistema.gestao.operacional.model.Demanda;
import com.sistema.gestao.operacional.model.Usuario;
import com.sistema.gestao.operacional.repository.DemandaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

@Service
public class DemandaService {

    @Autowired
    private DemandaRepository demandaRepository;

    @Autowired
    private LogService logService;

    public Demanda criar(Demanda demanda, Usuario usuario) {

        demanda.setDataCriacao(LocalDate.now());

        Demanda salva = demandaRepository.save(demanda);

        logService.registrar("Criou demanda: " + demanda.getTitulo(), usuario);

        return salva;
    }

    public List<Demanda> listar() {
        return demandaRepository.findAll();
    }

    public Demanda atualizar(Long id, Demanda dados, Usuario usuario) {

        Demanda demanda = demandaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Demanda não encontrada"));

        demanda.setTitulo(dados.getTitulo());
        demanda.setDescricao(dados.getDescricao());
        demanda.setStatus(dados.getStatus());
        demanda.setPrioridade(dados.getPrioridade());
        demanda.setPrazo(dados.getPrazo());

        if ("CONCLUIDA".equalsIgnoreCase(dados.getStatus())) {
            demanda.setDataConclusao(LocalDate.now());
        }

        Demanda salva = demandaRepository.save(demanda);

        logService.registrar("Atualizou demanda: " + demanda.getTitulo(), usuario);

        return salva;
    }

    public void deletar(Long id, Usuario usuario) {

        Demanda demanda = demandaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Demanda não encontrada"));

        demandaRepository.delete(demanda);

        logService.registrar("Deletou demanda: " + demanda.getTitulo(), usuario);
    }
}
