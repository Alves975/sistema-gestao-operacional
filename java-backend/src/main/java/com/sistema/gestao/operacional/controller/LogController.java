package com.sistema.gestao.operacional.controller;

import com.sistema.gestao.operacional.model.Log;
import com.sistema.gestao.operacional.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class LogController {

    @Autowired
    private LogService logService;

    
    @GetMapping
    public List<Log> listar() {
        return logService.listar();
    }

    
    @GetMapping("/usuario/{id}")
    public List<Log> logsUsuario(@PathVariable Long id) {
        return logService.logsPorUsuario(id);
    }
}
