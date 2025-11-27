package com.sistema.gestao.operacional.controller;

import com.sistema.gestao.operacional.model.Cliente;
import com.sistema.gestao.operacional.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        System.out.println("Cliente criado: " + cliente.getNome());
        return clienteService.criar(cliente);
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        System.out.println("Listando todos os clientes...");
        return clienteService.listar();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        System.out.println("Buscando cliente ID: " + id);
        return clienteService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Cliente atualizarCliente(@PathVariable Long id, @RequestBody Cliente dados) {
        System.out.println("Atualizando cliente ID: " + id);
        return clienteService.atualizar(id, dados);
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id) {
        System.out.println("Deletando cliente ID: " + id);
        clienteService.deletar(id);
    }
}
