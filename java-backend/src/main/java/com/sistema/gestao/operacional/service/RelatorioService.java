package com.sistema.gestao.operacional.service;

import com.sistema.gestao.operacional.dto.relatorio.*;
import com.sistema.gestao.operacional.repository.*;
import org.springframework.stereotype.Service;

@Service
public class RelatorioService {

    private final DemandaRepository demandaRepository;
    private final ClienteRepository clienteRepository;
    private final UsuarioRepository usuarioRepository;
    private final LogRepository logRepository;

    public RelatorioService(DemandaRepository demandaRepository,
                            ClienteRepository clienteRepository,
                            UsuarioRepository usuarioRepository,
                            LogRepository logRepository) {

        this.demandaRepository = demandaRepository;
        this.clienteRepository = clienteRepository;
        this.usuarioRepository = usuarioRepository;
        this.logRepository = logRepository;
    }

    public RelatorioDemandasDTO gerarRelatorioDemandas() {
        RelatorioDemandasDTO dto = new RelatorioDemandasDTO();
        dto.total = demandaRepository.count();
        dto.abertas = demandaRepository.countByStatus("ABERTA");
        dto.emAndamento = demandaRepository.countByStatus("EM_ANDAMENTO");
        dto.concluidas = demandaRepository.countByStatus("CONCLUIDA");
        dto.atrasadas = demandaRepository.countAtrasadas();
        return dto;
    }

    public RelatorioClientesDTO gerarRelatorioClientes() {
        RelatorioClientesDTO dto = new RelatorioClientesDTO();
        dto.totalClientes = clienteRepository.count();
        dto.clientesAtivos = clienteRepository.countByStatus("ATIVO");
        dto.clientesInativos = clienteRepository.countByStatus("INATIVO");
        return dto;
    }

    public RelatorioUsuariosDTO gerarRelatorioUsuarios() {
        RelatorioUsuariosDTO dto = new RelatorioUsuariosDTO();
        dto.totalUsuarios = usuarioRepository.count();
        dto.admins = usuarioRepository.countByRole("ADMIN");
        dto.operadores = usuarioRepository.countByRole("OPERADOR");
        return dto;
    }

    public RelatorioLogsDTO gerarRelatorioLogs() {
        RelatorioLogsDTO dto = new RelatorioLogsDTO();
        dto.totalLogs = logRepository.count();
        dto.logsHoje = logRepository.countLogsHoje();
        dto.logsSemana = logRepository.countLogsSemana();
        return dto;
    }

    public RelatorioGeralDTO gerarRelatorioGeral() {
        RelatorioGeralDTO dto = new RelatorioGeralDTO();
        dto.demandas = gerarRelatorioDemandas();
        dto.clientes = gerarRelatorioClientes();
        dto.usuarios = gerarRelatorioUsuarios();
        dto.logs = gerarRelatorioLogs();
        return dto;
    }
}
