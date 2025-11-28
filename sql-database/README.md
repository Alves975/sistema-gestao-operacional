# 📘 Banco de Dados – Sistema de Gestão Operacional
---

Este diretório contém toda a modelagem e scripts SQL utilizados pelo **Sistema de Gestão Operacional**, incluindo criação das tabelas, relacionamentos, índices, views e procedures.  
A estrutura foi desenvolvida em **MySQL/MariaDB**, seguindo boas práticas de organização, desempenho e integridade dos dados.

---

## 🗄️ Estrutura Geral do Banco

O sistema utiliza quatro tabelas principais:

### **1. `usuarios`**
Armazena informações dos usuários do sistema:
- `username`
- `senha_hash`
- `status` (ativo/bloqueado)
- permissões (opcional)

### **2. `clientes`**
Contém informações de pessoas ou empresas atendidas:
- `nome`
- `sobrenome`
- `email`
- `cpf`
- `data_cadastro`

### **3. `demandas`**
Tabela central para registro de solicitações:
- `titulo`
- `descricao`
- `prioridade`
- `status`
- `cliente_id`
- `usuario_id`
- `data_criacao`
- `data_conclusao`

### **4. `logs`**
Registro de ações realizadas, usado para auditoria:
- `usuario_id`
- `acao`
- `data_hora`
- `demanda_id` (opcional)

---

## 📂 Arquivos Incluídos

### **📄 `init.sql`**
Contém toda a estrutura inicial do banco:
- criação das tabelas  
- chaves primárias  
- chaves estrangeiras  
- restrições (`NOT NULL`, `UNIQUE`)  
- relacionamentos entre entidades  

---

### **📄 `views.sql`**
Arquivo contendo todas as *views* utilizadas para consultas otimizadas e relatórios:
- `vw_clientes_com_demandas`
- `vw_demandas_abertas`
- `vw_demandas_fechadas_por_dia`
- `vw_logs_com_usuarios`

Essas views facilitam consultas para o backend e relatórios gerados via Python.

---

### **📄 `procedures.sql`**
Define todas as **stored procedures** usadas pelo sistema:
- criação de demandas  
- atualização de status  
- atualização de prioridade  
- geração de relatórios  
- registro de logs  
- bloqueio/desbloqueio de usuários  

Essas procedures garantem regras de negócio padronizadas no banco.

---

### **📄 `indexes.sql`**
Lista todos os **índices de desempenho** definidos no sistema:
- índices por status, prioridade e datas  
- índices exclusivos para `username` e `email`  
- índices em chaves estrangeiras  
- índices para acelerar relatórios e auditoria  

---

## 🔌 Compatibilidade
- **MySQL 8+**  
- **MariaDB 10+**  
- Charset recomendado: **UTF8MB4**

---

## 🚀 Como Executar

Para criar o banco completo, execute os arquivos na ordem:

```bash
mysql -u seu_usuario -p < init.sql
mysql -u seu_usuario -p < views.sql
mysql -u seu_usuario -p < procedures.sql
mysql -u seu_usuario -p < indexes.sql
