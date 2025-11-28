package com.sistema.gestao.operacional.controller;

import com.sistema.gestao.operacional.model.Demanda;
import com.sistema.gestao.operacional.model.Usuario;
import com.sistema.gestao.operacional.service.DemandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demandas")
public class DemandaController {

    @Autowired
    private DemandaService demandaService;

    // Criar demanda
    @PostMapping("/{usuarioId}")
    public Demanda criar(@RequestBody Demanda demanda, @PathVariable Long usuarioId) {

        Usuario usuario = new Usuario();
        usuario.setId(usuarioId);

        return demandaService.criar(demanda, usuario);
    }

    // Listar todas
    @GetMapping
    public List<Demanda> listar() {
        return demandaService.listar();
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public Demanda buscar(@PathVariable Long id) {
        return demandaService.listar()
                .stream()
                .filter(d -> d.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Demanda não encontrada"));
    }

    // Atualizar
    @PutMapping("/{id}/{usuarioId}")
    public Demanda atualizar(
            @PathVariable Long id,
            @PathVariable Long usuarioId,
            @RequestBody Demanda dados) {

        Usuario usuario = new Usuario();
        usuario.setId(usuarioId);

        return demandaService.atualizar(id, dados, usuario);
    }

    // Deletar
    @DeleteMapping("/{id}/{usuarioId}")
    public void deletar(@PathVariable Long id, @PathVariable Long usuarioId) {

        Usuario usuario = new Usuario();
        usuario.setId(usuarioId);

        demandaService.deletar(id, usuario);
    }
}
