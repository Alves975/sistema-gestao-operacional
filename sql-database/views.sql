

CREATE or replace view vw_clientes_com_demandas AS
select 
    c.id as cliente_id,
    c.nome as cliente_nome,
    c.sobrenome as cliente_sobrenome,
    c.email as cliente_email,
    count(d.id) as total_demandas
from 
    clientes c
left join 
    demandas d on c.id = d.cliente_id
group by 
    c.id, c.nome, c.sobrenome, c.email;


CREATE or replace view vw_demandas_abertas AS
select 
    d.id as demanda_id,
    d.titulo as demanda_titulo,
    d.descricao as demanda_descricao,
    d.status as demanda_status,
    d.prioridade as demanda_prioridade,
    d.data_criacao as demanda_data_criacao,
    c.nome as cliente_nome,
    u.username as usuario_responsavel
from 
    demandas d
inner join 
    clientes c on d.cliente_id = c.id
inner join 
    usuarios u on d.usuario_id = u.id
where 
    WHERE LOWER(d.status) = 'aberta';


CREATE or replace view vw_demandas_fechadas_por_dia AS
select 
    d.data_conclusao as data_fechamento,
    count(d.id) as total_demandas_fechadas
from 
    demandas d
where 
    d.status = 'fechada'
group by 
    d.data_conclusao;


CREATE or replace view vw_logs_com_usuarios AS
select 
    l.id as log_id,
    u.username as usuario_nome,
    l.acao as log_acao,
    l.data_hora as log_data_hora
from 
    logs l
inner join 
    usuarios u on l.usuario_id = u.id;