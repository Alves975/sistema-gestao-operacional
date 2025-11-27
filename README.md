📘 Sistema de Gestão Operacional – Dashboard Inteligente

Desenvolvido por: Eduardo Alves Martins

🚀 Descrição do Projeto

O Sistema de Gestão Operacional é uma plataforma completa desenvolvida para simular processos empresariais reais, integrando:

✔ Java + Spring Boot (API REST)
✔ MySQL (banco relacional)
✔ Python (automação e relatórios)
✔ C (utilitário técnico)
✔ HTML/CSS (dashboard)
✔ Git/GitHub (versionamento)

Este projeto demonstra domínio prático em arquitetura, backend, automação, banco de dados e boas práticas de desenvolvimento.

🛠 Tecnologias Utilizadas
🔧 Desenvolvimento

VS Code (extensões para Java, Python, SQL, C e HTML)

Git + GitHub

Postman

☕ Backend (Java)

Java 17 (OpenJDK)

Spring Boot

Spring Web

Spring Data JPA

Maven

🐍 Automação em Python

Python 3 + pip

Scripts de análise, relatórios e futura inteligência artificial

🐬 Banco de Dados

MySQL / MariaDB

Scripts SQL versionados
→ sql-database/init.sql

⚙ Utilitário em C

GCC

Programa de validação de arquivos e logs

🌐 Dashboard

HTML + CSS

☁ Nuvem (Futuro)

AWS CLI

Deploy via EC2, RDS e S3

📂 Estrutura do Repositório
sistema-gestao-operacional/
│
├── java-backend/           → API REST em Java
├── python-automation/      → Scripts de automação e relatórios
├── sql-database/           → Scripts SQL (init.sql, data.sql)
├── c-utility/              → Utilitário técnico em C
├── dashboard-html-css/     → Interface HTML/CSS
└── docs/                   → Documentação adicional

🏗 API REST – Java + Spring Boot
📌 Clientes
Método	Rota	Descrição
POST	/clientes	Cadastrar cliente
GET	/clientes	Listar clientes
GET	/clientes/{id}	Buscar cliente
PUT	/clientes/{id}	Atualizar cliente
DELETE	/clientes/{id}	Remover cliente
📌 Demandas
Método	Rota	Descrição
POST	/demandas	Criar demanda
GET	/demandas	Listar demandas
GET	/demandas/{id}	Buscar demanda
PUT	/demandas/{id}	Atualizar demanda
DELETE	/demandas/{id}	Deletar demanda
PATCH	/demandas/{id}/status	Atualizar status
🗄 Banco de Dados – MySQL

O banco contém 4 tabelas principais:

usuarios

clientes

demandas

logs

▶ Instalação:
sudo mysql -u root -p
CREATE DATABASE sistema_gestao_operacional;
exit;

mysql -u root -p sistema_gestao_operacional < sql-database/init.sql

🐍 Automação – Python

Scripts planejados executam:

Conexão com MySQL

Análise de demandas

Geração de relatórios (CSV/HTML)

Classificação de prioridade

Futuro: integração com IA + AWS S3

⚙ Utilitário em C

Utilitário para:

Validar arquivos

Analisar estrutura

Registrar logs

Testar relatórios

Compilar com:

gcc utilitario.c -o utilitario

🌐 Dashboard – HTML + CSS

Exibe:

Resumo das demandas

Estatísticas

Relatórios

Informações gerais do sistema

🔧 Instalação do Projeto
▶ 1. Clone o repositório:
git clone https://github.com/Alves975/sistema-gestao-operacional.git

▶ 2. Entrar no diretório:
cd sistema-gestao-operacional

▶ 3. Executar o backend:
cd java-backend
mvn spring-boot:run

▶ 4. Instalar o banco:
mysql -u root -p sistema_gestao_operacional < sql-database/init.sql

▶ 5. Executar automação Python:
cd python-automation
python3 script.py

🧑‍💻 Autor

Eduardo Alves Martins
Desenvolvedor Full Stack & Analista de Sistemas

🔗 LinkedIn:
https://www.linkedin.com/in/eduardo-alves-martins-b5604b371/

🐙 GitHub:
https://github.com/Alves975

🎯 Objetivo do Projeto

Demonstrar domínio prático em:

✔ Java / Spring Boot
✔ Python / Automação
✔ MySQL / SQL
✔ C / Ferramentas técnicas
✔ Git / GitHub
✔ HTML / CSS
✔ Arquitetura de sistemas
✔ Boas práticas e deploy