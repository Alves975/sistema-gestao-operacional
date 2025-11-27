package com.sistema.gestao.operacional.controller;

import com.sistema.gestao.operacional.model.Demanda;
import com.sistema.gestao.operacional.service.DemandaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demandas")
public class DemandaController {

    private final DemandaService demandaService;

    public DemandaController(DemandaService demandaService) {
        this.demandaService = demandaService;
    }

    
    @PostMapping
    public Demanda criarDemanda(@RequestBody Demanda demanda) {
        System.out.println("Demanda criada: " + demanda.getTitulo());
        return demandaService.criar(demanda);
    }

    
    @GetMapping
    public List<Demanda> listarDemandas(
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String prioridade
    ) {
        System.out.println("Listando demandas | Status: " + status + " | Prioridade: " + prioridade);
        return demandaService.listar(status, prioridade);
    }

    
    @GetMapping("/{id}")
    public Demanda buscarPorId(@PathVariable Long id) {
        System.out.println("Buscando demanda ID: " + id);
        return demandaService.buscarPorId(id);
    }

    
    @PutMapping("/{id}")
    public Demanda atualizarDemanda(@PathVariable Long id, @RequestBody Demanda dados) {
        System.out.println("Atualizando demanda ID: " + id);
        return demandaService.atualizar(id, dados);
    }

    
    @DeleteMapping("/{id}")
    public void deletarDemanda(@PathVariable Long id) {
        System.out.println("Deletando demanda ID: " + id);
        demandaService.deletar(id);
    }

    
    @PatchMapping("/{id}/status")
    public Demanda alterarStatus(
            @PathVariable Long id,
            @RequestParam String status
    ) {
        System.out.println("Alterando status da demanda ID " + id + " para: " + status);
        return demandaService.alterarStatus(id, status);
    }

    
    @GetMapping("/cliente/{clienteId}")
    public List<Demanda> listarPorCliente(@PathVariable Long clienteId) {
        System.out.println("Listando demandas do cliente ID: " + clienteId);
        return demandaService.listarPorCliente(clienteId);
    }

    
    @GetMapping("/usuario/{usuarioId}")
    public List<Demanda> listarPorUsuario(@PathVariable Long usuarioId) {
        System.out.println("Listando demandas do usuário ID: " + usuarioId);
        return demandaService.listarPorUsuario(usuarioId);
    }
}
