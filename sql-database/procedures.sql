
CREATE PROCEDURE criar_demanda_padronizada (
    IN p_titulo VARCHAR(255),
    IN p_descricao TEXT,
    IN p_prioridade INT,
    IN p_data_criacao DATETIME,
    OUT p_id_demanda INT
)
BEGIN
    INSERT INTO demandas (titulo, descricao, prioridade, data_criacao)
    VALUES (p_titulo, p_descricao, p_prioridade, p_data_criacao);
    SET p_id_demanda = LAST_INSERT_ID();
END;



DELIMITER $$

CREATE PROCEDURE sp_atualizar_status_demanda(
    IN p_demanda_id INT,
    IN p_novo_status VARCHAR(20)
)
BEGIN
    UPDATE demandas
    SET 
        status = p_novo_status,
        data_conclusao = IF(p_novo_status = 'fechada', NOW(), data_conclusao)
    WHERE id = p_demanda_id;
END $$

DELIMITER ;


DELIMITER $$

CREATE PROCEDURE sp_relatorio_diario()
BEGIN
    SELECT 
        c.nome AS cliente,
        d.titulo,
        d.prioridade,
        d.status,
        d.data_criacao
    FROM demandas d
    INNER JOIN clientes c ON d.cliente_id = c.id
    WHERE DATE(d.data_criacao) = CURDATE();
END $$

DELIMITER ;


DELIMITER $$

CREATE PROCEDURE sp_registrar_log(
    IN p_usuario_id INT,
    IN p_acao VARCHAR(255)
)
BEGIN
    INSERT INTO logs (usuario_id, acao, data_hora)
    VALUES (p_usuario_id, p_acao, NOW());
END $$

DELIMITER ;

DELIMITER $$

CREATE PROCEDURE sp_atualizar_prioridade_demanda(
    IN p_demanda_id INT,
    IN p_nova_prioridade INT
)
BEGIN
    UPDATE demandas
    SET prioridade = p_nova_prioridade
    WHERE id = p_demanda_id;
END $$

DELIMITER ;

DELIMITER $$
CREATE PROCEDURE sp_Bloquear_Usuario(
    IN p_usuario_id INT
)
BEGIN
    UPDATE usuarios
    SET status = 'bloqueado'
    WHERE id = p_usuario_id;
END $$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE sp_Desbloquear_Usuario(
    IN p_usuario_id INT
)
BEGIN
    UPDATE usuarios
    SET status = 'ativo'
    WHERE id = p_usuario_id;
END $$
DELIMITER ;

DELIMITER $$

CREATE PROCEDURE sp_deletar_cliente_seguro(
    IN p_cliente_id INT
)
BEGIN
    DECLARE v_protecao VARCHAR(255);

    SELECT valor INTO v_protecao
    FROM configuracoes_sistema
    WHERE chave = 'protecao_delete';

    IF v_protecao = 'ativado' THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Operação bloqueada: Exclusão protegida pelo sistema.';
    END IF;

    DELETE FROM clientes WHERE id = p_cliente_id;
END $$

DELIMITER ;
