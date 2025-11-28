package com.sistema.gestao.operacional.controller;

import com.sistema.gestao.operacional.model.Cliente;
import com.sistema.gestao.operacional.model.Usuario;
import com.sistema.gestao.operacional.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    
    @PostMapping("/{usuarioId}")
    public Cliente criar(@RequestBody Cliente cliente, @PathVariable Long usuarioId) {

        Usuario usuario = new Usuario();
        usuario.setId(usuarioId); // apenas referencia para log

        return clienteService.criar(cliente, usuario);
    }

    
    @GetMapping
    public List<Cliente> listar() {
        return clienteService.listar();
    }

    
    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Long id) {
        return clienteService.buscarPorId(id);
    }

    
    @PutMapping("/{id}/{usuarioId}")
    public Cliente atualizar(
            @PathVariable Long id,
            @PathVariable Long usuarioId,
            @RequestBody Cliente dados) {

        Usuario usuario = new Usuario();
        usuario.setId(usuarioId);

        return clienteService.atualizar(id, dados, usuario);
    }

    
    @DeleteMapping("/{id}/{usuarioId}")
    public void deletar(
            @PathVariable Long id,
            @PathVariable Long usuarioId) {

        Usuario usuario = new Usuario();
        usuario.setId(usuarioId);

        clienteService.deletar(id, usuario);
    }

}
