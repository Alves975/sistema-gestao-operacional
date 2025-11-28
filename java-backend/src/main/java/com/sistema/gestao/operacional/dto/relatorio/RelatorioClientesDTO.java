package com.sistema.gestao.operacional.dto.relatorio;

import lombok.*;

@Data
public class RelatorioClientesDTO {
    public long totalClientes;
    public long clientesAtivos;
    public long clientesInativos;
}
