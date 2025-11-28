package com.sistema.gestao.operacional.controller;

import com.sistema.gestao.operacional.dto.relatorio.*;
import com.sistema.gestao.operacional.service.RelatorioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/relatorios")
public class RelatorioController {

    private final RelatorioService service;

    public RelatorioController(RelatorioService service){ this.service = service; }

    @GetMapping("/demandas")
    public RelatorioDemandasDTO demandas(){ return service.gerarRelatorioDemandas(); }

    @GetMapping("/clientes")
    public RelatorioClientesDTO clientes(){ return service.gerarRelatorioClientes(); }

    @GetMapping("/usuarios")
    public RelatorioUsuariosDTO usuarios(){ return service.gerarRelatorioUsuarios(); }

    @GetMapping("/logs")
    public RelatorioLogsDTO logs(){ return service.gerarRelatorioLogs(); }

    @GetMapping("/geral")
    public RelatorioGeralDTO geral(){ return service.gerarRelatorioGeral(); }
}
