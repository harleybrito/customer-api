# Quarkus Customer-API

## Descrição
**Quarkus Customer-API** é uma aplicação desenvolvida com o framework Quarkus, projetada para gerenciar informações de clientes de forma eficiente e escalável. A API oferece endpoints para criar, ler, atualizar e deletar dados de clientes, garantindo alta performance e baixa latência.

## Tecnologias Utilizadas
- **Quarkus**: Framework Java nativo na nuvem.
- **RESTEasy Jackson**: Extensão para suporte a JSON com Jackson.
- **Hibernate ORM com Panache**: Framework de mapeamento objeto-relacional simplificado.
- **JDBC PostgreSQL**: Conector JDBC para PostgreSQL.
- **CDI (Contexts and Dependency Injection)**: Implementação de injeção de dependência.
- **SmallRye OpenAPI**: Implementação de OpenAPI para documentar a API.
- **JUnit 5**: Framework de testes para Java.
- **REST Assured**: Biblioteca para testes de serviços REST.
- **Lombok**: Biblioteca para reduzir a verbosidade do código Java.

## Requisitos
- **Java 22+**
- **Maven 3.6.3+**
- **Docker** (opcional, para execução em contêiner)

## Instalação
1. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/quarkus-customer-api.git
    cd quarkus-customer-api
    ```

2. Compile e execute a aplicação:
    ```sh
    ./mvnw compile quarkus:dev
    ```

## Endpoints
A API oferece os seguintes endpoints:

- **GET /customers**: Retorna a lista de todos os clientes.
- **POST /customers**: Cria um novo cliente.
- **PUT /customers/{id}**: Atualiza as informações de um cliente existente.
- **DELETE /customers/{id}**: Deleta um cliente.

## Configuração
As configurações da aplicação podem ser ajustadas no arquivo `application.properties`.