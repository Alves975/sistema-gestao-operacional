package com.sistema.gestao.operacional.service;

import com.sistema.gestao.operacional.model.Log;
import com.sistema.gestao.operacional.model.Usuario;
import com.sistema.gestao.operacional.repository.LogRepository;
import com.sistema.gestao.operacional.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LogService {

    private final LogRepository logRepository;
    private final UsuarioRepository usuarioRepository;

    public LogService(LogRepository logRepository, UsuarioRepository usuarioRepository) {
        this.logRepository = logRepository;
        this.usuarioRepository = usuarioRepository;
    }

    
    public void registrar(String acao, Usuario usuario) {

        Log log = new Log();
        log.setAcao(acao);
        log.setTimestamp(LocalDateTime.now());
        log.setUsuario(usuario);

        logRepository.save(log);
    }

    
    public List<Log> listar() {
        return logRepository.findAll();
    }

    
    public List<Log> logsPorUsuario(Long usuarioId) {
        return logRepository.findByUsuarioId(usuarioId);
    }
}
