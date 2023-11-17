# DSList PRO
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

# Sobre o projeto

É um sistema de coleção de jogos de plataformas e aventura e RPG  a onde o usuário poderá ter a cesso listas de jogos e erroganizar a lista posicionando seus jogos favoritos em qualquer posição de sua lista.

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Docker compose
## Perfis de projeto
1. Perfis de projetos de desenvolvimento e testes:
- test
- Banco de dados H2
2. Perfil de homologação / staging
- dev
- Banco de dados Postgres de homologação
3. Perfil de produção
- prod
- Banco de dados Postgres de produção
  
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/devsuperior/sds1-wmazoni

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/devsuperior/sds1-wmazoni

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Wellington Mazoni de Andrade

https://www.linkedin.com/in/wmazoni
