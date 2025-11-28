Projeto Java Backend - estrutura pronta
--------------------------------------

Conteúdo:
- pom.xml com dependências (Spring Boot, JPA, H2, MySQL connector, Lombok, jBCrypt).
- Entidades: Demanda, Cliente, Usuario, Log
- Repositórios Spring Data JPA
- Services básicos e RelatorioService
- Controllers REST simples
- DTOs de relatório

Como usar:
1. Substitua a pasta atual `java-backend` pela desta versão.
2. Entre na pasta e rode:
   mvn clean install
   mvn spring-boot:run

Por padrão usa H2 (funciona sem banco). Para MySQL: edite `src/main/resources/application.properties`.
