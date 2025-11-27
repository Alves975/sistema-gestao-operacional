package com.sistema.gestao.operacional.controller;

import com.sistema.gestao.operacional.dto.relatorio.*;
import com.sistema.gestao.operacional.service.RelatorioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/relatorios")
public class RelatorioController {

    private final RelatorioService relatorioService;

    public RelatorioController(RelatorioService relatorioService) {
        this.relatorioService = relatorioService;
    }

    @GetMapping("/demandas")
    public RelatorioDemandasDTO demandas() {
        return relatorioService.gerarRelatorioDemandas();
    }

    @GetMapping("/clientes")
    public RelatorioClientesDTO clientes() {
        return relatorioService.gerarRelatorioClientes();
    }

    @GetMapping("/usuarios")
    public RelatorioUsuariosDTO usuarios() {
        return relatorioService.gerarRelatorioUsuarios();
    }

    @GetMapping("/logs")
    public RelatorioLogsDTO logs() {
        return relatorioService.gerarRelatorioLogs();
    }

    @GetMapping("/geral")
    public RelatorioGeralDTO geral() {
        return relatorioService.gerarRelatorioGeral();
    }
}
