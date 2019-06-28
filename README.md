# LojaVirtual API Rest

## Sobre o projeto

A Loja Virtual API Rest é um projeto desenvolvido em Spring Boot 2 usando Maven, tem como principal objetivo servir dados para a aplicação <a href="https://github.com/LittleNogueira/loja-virtual-web" target="+blank" >loja-virtual-web</a>

## Intruções para configuração

Requisitos

- <a href="https://docs.docker.com/docker-for-windows/install/" target="_blank" >Docker</a>
- <a href="http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html"  target="_blank">JDK</a>
- <a href="https://maven.apache.org/" target="_blank">Maven</a>

Suba o container postgre com o seguinte comando

```
 cd /caminho/do/projeto/loja-virtual-core/
 docker-compose up -d
```

Importe e excute o projeto em uma IDE Java, Eclipse de preferencia.

### Rotas

```

    GET : http://localhost:8080/api/products
    GET : http://localhost:8080/api/products/{id}
    POST : http://localhost:8080/api/products
    PUT : http://localhost:8080/api/products/{id}
    DELETE : http://localhost:8080/api/products/{id}

```

## Sobre as tecnologias

#### Spring Boot 2

O Spring Boot é um projeto da Spring que utiliza a linguagem Java e veio para facilitar o processo de configuração e publicação de nossas aplicações. A intenção é ter o seu projeto rodando o mais rápido possível e sem complicação.

#### Maven

O Apache Maven é uma ferramenta de gerenciamento e compreensão de projetos de software. Com base no conceito de um modelo de objeto de projeto (POM), o Maven pode gerenciar a criação, o relatório e a documentação de um projeto a partir de uma informação central.

#### PostgreSQL

PostgreSQL é um sistema gerenciador de banco de dados objeto relacional (SGBD), desenvolvido como projeto de código aberto

#### Liquibase

O Liquibase é uma biblioteca independente de banco de dados de código aberto para rastreamento, gerenciamento e aplicação de alterações no esquema do banco de dados. Ele foi iniciado em 2006 para permitir o acompanhamento mais fácil de alterações de banco de dados, especialmente em um ambiente de desenvolvimento de software ágil.
