CREATE DATABASE sistema_gestao;
USE sistema_gestao;

CREATE TABLE clientes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    sobrenome VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    telefone VARCHAR(20),
    cpf VARCHAR(14) UNIQUE,
    endereco VARCHAR(255),
    cidade VARCHAR(100),
    estado VARCHAR(50)
);

CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    role VARCHAR(50) NOT NULL
);

CREATE TABLE demandas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cliente_id BIGINT NOT NULL,
    usuario_id BIGINT NOT NULL,
    titulo VARCHAR(150) NOT NULL,
    descricao TEXT,
    status VARCHAR(50) NOT NULL,
    prioridade VARCHAR(20),
    data_criacao DATE DEFAULT CURRENT_DATE,
    data_conclusao DATE,
    prazo DATE,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE logs (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    demanda_id BIGINT NULL,
    acao VARCHAR(255) NOT NULL,
    data_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    FOREIGN KEY (demanda_id) REFERENCES demandas(id)
);

CREATE TABLE configuracoes_sistema (
    id INT PRIMARY KEY AUTO_INCREMENT,
    chave VARCHAR(255) UNIQUE,
    valor VARCHAR(255)
);

INSERT INTO configuracoes_sistema (chave, valor)
VALUES ('protecao_delete', 'ativado');
