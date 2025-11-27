# 🚀 Sistema de Gestão Operacional

Um sistema completo desenvolvido em **Java + Spring Boot**, com objetivo de facilitar o gerenciamento de **clientes, usuários, demandas e logs de operação** dentro de uma empresa.  
O sistema é modular, seguro, escalável e segue boas práticas de arquitetura (Controller → Service → Repository → Model).

---

## 📌 Funcionalidades Principais

### ✔ Gestão de Usuários
- Cadastro de usuários
- Controle de permissões (ADMIN / OPERADOR)
- Autenticação futura via JWT

### ✔ Gestão de Clientes
- Cadastro e edição de clientes
- Consultas por ID
- Exclusão e listagem geral

### ✔ Gestão de Demandas
- Criação de demandas para clientes
- Atualização e exclusão
- Alteração de status (ABERTA, EM_EXECUCAO, CONCLUIDA)
- Filtros por prioridade, status, cliente e responsável
- Registro automático de logs

### ✔ Logs do Sistema
- Registra todas as ações realizadas
- Guarda data, usuário e demanda relacionada
- Consultas para auditoria e histórico

### ✔ Relatórios
Relatórios gerados em **JSON**, permitindo uso em dashboards:

- Relatório de Demandas  
- Relatório de Clientes  
- Relatório de Usuários  
- Relatório de Logs  
- Relatório Geral (Completo)

---

## 🛠 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **MySQL**
- **Apache POI** (futuro uso para relatórios em Excel)
- **Maven**
- **Git / GitHub**

---

## 📁 Estrutura do Projeto

