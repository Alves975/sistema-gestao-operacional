📘 Sistema de Gestão Operacional – Dashboard Inteligente
Desenvolvido por Eduardo Alves Martins

🚀 Descrição do Projeto

O Sistema de Gestão Operacional é uma plataforma completa desenvolvida para simular processos empresariais reais, integrando:

✔ Backend em Java + Spring Boot
✔ Banco de dados MySQL
✔ Automação com Python
✔ Utilitário técnico em C
✔ Dashboard em HTML/CSS
✔ Versionamento com Git e GitHub

Este projeto demonstra domínio em múltiplas tecnologias, arquitetura profissional e integração entre camadas de software.

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

Scripts de análise, relatórios e integração futura com IA

🐬 Banco de Dados

MySQL / MariaDB

Scripts SQL versionados (sql-database/init.sql)

⚙ Utilitário em C

GCC

Programa de validação e logs

🌐 Dashboard Web

HTML / CSS

☁ Nuvem (Futuro)

AWS CLI

EC2 / RDS / S3 (deploy e automações)

📂 Estrutura do Repositório
sistema-gestao-operacional/
│
├── java-backend/           → API REST em Java
├── python-automation/      → Scripts de automação e relatórios
├── sql-database/           → Scripts SQL (init.sql, data.sql)
├── c-utility/              → Utilitário técnico em C
├── dashboard-html-css/     → Interface simples HTML/CSS
└── docs/                   → Documentação adicional

🏗 API REST – Java + Spring Boot
🔥 Endpoints Principais
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

O banco é composto por quatro tabelas principais:

usuarios

clientes

demandas

logs

O script completo está em:

sql-database/init.sql

▶ Como instalar o banco:
sudo mysql -u root -p
CREATE DATABASE sistema_gestao_operacional;
exit;

mysql -u root -p sistema_gestao_operacional < sql-database/init.sql

🐍 Automação – Python

Scripts planejados:

Conexão com MySQL

Análise de demandas pendentes

Classificação de prioridade

Geração de relatórios (CSV/HTML)

Futuro: integração com IA e AWS S3

Exemplos:

calcular_prioridade(demanda)
gerar_relatorio_diario()
conectar_mysql()

⚙ Utilitário em C

Programa simples com:

Leitura de arquivos

Validação de relatórios

Logs

Uso de ponteiros

Compilação via GCC

🌐 Dashboard – HTML + CSS

Interface simples e funcional exibindo:

resumo do sistema

estatísticas

links para relatórios

informações do desenvolvedor

🔧 Instalação do Projeto
▶ 1. Clone o repositório:
git clone https://github.com/Alves975/sistema-gestao-operacional.git

▶ 2. Entre no diretório:
cd sistema-gestao-operacional

▶ 3. Backend – Java
cd java-backend
mvn spring-boot:run

▶ 4. Banco de Dados
mysql -u root -p sistema_gestao_operacional < sql-database/init.sql

▶ 5. Automação
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
✔ HTML / CSS / Front-end
✔ Arquitetura de sistemas
✔ Deploy e boas práticas