# Locadora de Filmes - Spring Boot

Este é um sistema de **locadora de filmes** desenvolvido com **Java** e **Spring Boot**. O objetivo do projeto é fornecer uma plataforma onde os usuários podem consultar filmes disponíveis para locação, realizar a locação de filmes, consultar histórico e gerenciar informações sobre os filmes e clientes.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto.
- **Spring Boot**: Framework para desenvolvimento rápido de aplicações Java com foco em convenção sobre configuração.
- **Spring Data JPA**: Para acesso ao banco de dados relacional utilizando JPA (Java Persistence API).
- **Spring Security**: Para autenticação e controle de acesso.
- **H2 Database**: Banco de dados em memória utilizado para desenvolvimento e testes.
- **Thymeleaf**: Motor de templates para renderização de páginas HTML no backend.
- **Maven**: Gerenciador de dependências e build do projeto.

## Funcionalidades

- **Gestão de Filmes**: Permite cadastrar informações sobre os filmes disponíveis para locação, como título e categoria.

## Endpoints

- **POST /ListarFilmes**: Lista todos os filmes cadastrados.
- **POST /CadastrarFilmes**: Formulário para adicionar, remover, alterar e listar um novo filme.
- **GET /CadastroFilmes**: Adiciona um novo filme à locadora.
- **POST /DeletarFilmes**: Deleta um filme por id.
