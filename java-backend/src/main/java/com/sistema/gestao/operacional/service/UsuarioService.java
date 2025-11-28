package com.sistema.gestao.operacional.service;

import com.sistema.gestao.operacional.model.Usuario;
import com.sistema.gestao.operacional.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mindrot.jbcrypt.BCrypt;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private LogService logService;

    public Usuario criar(Usuario usuario) {

        String hash = BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt());
        usuario.setPassword(hash);

        Usuario salvo = usuarioRepository.save(usuario);

        logService.registrar("Criou o usuário: " + usuario.getUsername(), salvo);

        return salvo;
    }

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario atualizar(Long id, Usuario dados) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        usuario.setUsername(dados.getUsername());
        usuario.setEmail(dados.getEmail());
        usuario.setRole(dados.getRole());
        usuario.setStatus(dados.getStatus());

        if (dados.getPassword() != null && !dados.getPassword().isBlank()) {
            String hash = BCrypt.hashpw(dados.getPassword(), BCrypt.gensalt());
            usuario.setPassword(hash);
        }

        Usuario salvo = usuarioRepository.save(usuario);

        logService.registrar("Atualizou o usuário: " + usuario.getUsername(), salvo);

        return salvo;
    }

    public void deletar(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        usuarioRepository.delete(usuario);

        logService.registrar("Deletou o usuário: " + usuario.getUsername(), usuario);
    }
}
