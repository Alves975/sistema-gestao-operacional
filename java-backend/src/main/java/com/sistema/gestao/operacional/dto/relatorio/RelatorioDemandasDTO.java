package com.sistema.gestao.operacional.dto.relatorio;

import lombok.*;

@Data
public class RelatorioDemandasDTO {
    public long total;
    public long abertas;
    public long emAndamento;
    public long concluidas;
    public long atrasadas;
}
