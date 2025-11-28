package com.sistema.gestao.operacional.service;

import com.sistema.gestao.operacional.model.Cliente;
import com.sistema.gestao.operacional.model.Usuario;
import com.sistema.gestao.operacional.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private LogService logService;

    
    public Cliente criar(Cliente cliente, Usuario usuario) {

        cliente.setStatus("ATIVO");

        Cliente salvo = clienteRepository.save(cliente);

        logService.registrar("Criou cliente: " + cliente.getNome(), usuario);

        return salvo;
    }

    
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    
    public Cliente atualizar(Long id, Cliente dados, Usuario usuario) {

        Cliente cliente = buscarPorId(id);

        cliente.setNome(dados.getNome());
        cliente.setCpf(dados.getCpf());
        cliente.setCnpj(dados.getCnpj());
        cliente.setTelefone(dados.getTelefone());
        cliente.setStatus(dados.getStatus());

        Cliente salvo = clienteRepository.save(cliente);

        logService.registrar("Atualizou cliente: " + cliente.getNome(), usuario);

        return salvo;
    }

    
    public void deletar(Long id, Usuario usuario) {

        Cliente cliente = buscarPorId(id);

        clienteRepository.delete(cliente);

        logService.registrar("Deletou cliente: " + cliente.getNome(), usuario);
    }
}
