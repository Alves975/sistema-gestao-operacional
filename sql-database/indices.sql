
   --ÍNDICES DA TABELA DEMANDAS
 

CREATE INDEX idx_demandas_status 
    ON demandas(status);


CREATE INDEX idx_demandas_prioridade 
    ON demandas(prioridade);


CREATE INDEX idx_demandas_data_criacao 
    ON demandas(data_criacao);


CREATE INDEX idx_demandas_data_conclusao 
    ON demandas(data_conclusao);


CREATE INDEX idx_demandas_cliente_id 
    ON demandas(cliente_id);



   --ÍNDICES DA TABELA USUÁRIOS

CREATE UNIQUE INDEX idx_usuarios_username 
    ON usuarios(username);


CREATE INDEX idx_clientes_cpf 
    ON clientes(cpf);


CREATE UNIQUE INDEX idx_clientes_email 
    ON clientes(email);




  --ÍNDICES DA TABELA LOGS

CREATE INDEX idx_logs_data_hora 
    ON logs(data_hora);


CREATE INDEX idx_logs_usuario_id 
    ON logs(usuario_id);


CREATE INDEX idx_logs_demanda_id 
    ON logs(demanda_id);
