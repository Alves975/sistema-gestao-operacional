package com.sistema.gestao.operacional.dto.relatorio;

import lombok.*;

@Data
public class RelatorioLogsDTO {
    public long totalLogs;
    public long logsHoje;
    public long logsSemana;
}
