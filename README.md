# LojaVirtual API Rest

## Sobre o projeto

A Loja Virtual API Rest é um projeto desenvolvido em Spring Boot 2 usando Gradle, tem como principal objetivo servir dados para a aplicação <a href="https://github.com/LittleNogueira/loja-virtual" target="+blank" >Loja Virtual Cliente</a>

## Intruções para configuração

Requisitos

- <a href="https://docs.docker.com/docker-for-windows/install/" target="_blank" >Docker</a>
- <a href="http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html"  target="_blank">JDK</a>
- <a href="https://gradle.org/install/" target="_blank">Gradle</a>

Crie um banco de dados com o nome "loja_virtual".

Altere a senha e usuario do banco no arquivo application.properties.

```
 CREATE DATABASE loja_virtual
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