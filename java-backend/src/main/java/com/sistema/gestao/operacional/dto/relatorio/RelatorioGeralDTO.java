package com.sistema.gestao.operacional.dto.relatorio;

import lombok.*;

@Data
public class RelatorioGeralDTO {
    public RelatorioDemandasDTO demandas;
    public RelatorioClientesDTO clientes;
    public RelatorioUsuariosDTO usuarios;
    public RelatorioLogsDTO logs;
}
