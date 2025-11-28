USE sistema_gestao;



INSERT INTO usuarios (username, email, password, role) VALUES
('admin', 'admin@sistema.com', '$2a$10$8YkD7TlsdA1AhgYJvK9a1u6rNaK/AE8ixC52h77weuPpJ46gPlU0q', 'ADMIN'),
('joao.silva', 'joao@sistema.com', '$2a$10$8YkD7TlsdA1AhgYJvK9a1u6rNaK/AE8ixC52h77weuPpJ46gPlU0q', 'OPERADOR'),
('maria.lima', 'maria@sistema.com', '$2a$10$8YkD7TlsdA1AhgYJvK9a1u6rNaK/AE8ixC52h77weuPpJ46gPlU0q', 'GERENTE');



INSERT INTO clientes (nome, sobrenome, email, telefone, cpf, endereco, cidade, estado) VALUES
('Carlos', 'Silva', 'carlos.silva@gmail.com', '11999990000', '12345678901', 'Rua Tiradentes, 100', 'São Paulo', 'SP'),
('Ana', 'Souza', 'ana.souza@gmail.com', '11988880000', '98765432100', 'Av Paulista, 2000', 'São Paulo', 'SP'),
('Pedro', 'Mendes', 'pedro.mendes@gmail.com', '11977770000', '11122233344', 'Rua das Flores, 45', 'Osasco', 'SP'),
('Julia', 'Castro', 'julia.castro@gmail.com', '11966660000', '55544433322', 'Rua Brasil, 123', 'Cotia', 'SP');




INSERT INTO demandas (
    cliente_id, usuario_id, titulo, descricao, status, prioridade, data_criacao, data_conclusao, prazo
) VALUES
(1, 1, 'Implantação do Sistema', 'Instalação completa do sistema no cliente.', 'ABERTA', 'ALTA', '2024-02-10', NULL, '2024-02-25'),

(2, 2, 'Correção de Bugs', 'Cliente relatou travamentos frequentes no módulo financeiro.', 'EM_ANDAMENTO', 'MEDIA', '2024-02-05', NULL, '2024-02-20'),

(3, 3, 'Atualização de Versão', 'Atualizar para versão 3.2 solicitada pelo cliente.', 'PAUSADA', 'BAIXA', '2024-01-30', NULL, '2024-03-01'),

(4, 1, 'Treinamento da Equipe', 'Treinamento dos operadores internos.', 'CONCLUIDA', 'MEDIA', '2024-01-15', '2024-01-20', '2024-01-25');




INSERT INTO logs (usuario_id, demanda_id, acao, data_hora) VALUES
(1, 1, 'Criou demanda de implantação', '2024-02-10 10:15:00'),
(2, 2, 'Iniciou correção de bugs', '2024-02-05 09:45:00'),
(3, 3, 'Pausou atualização de versão', '2024-02-01 14:20:00'),
(1, 4, 'Concluiu treinamento da equipe', '2024-01-20 17:30:00'),
(2, 2, 'Atualizou descrição da demanda', '2024-02-07 11:05:00');
