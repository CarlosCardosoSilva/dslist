# DSList PRO
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

# Sobre o projeto

É um sistema de coleção de jogos de plataformas e aventura e RPG  a onde o usuário poderá ter a cesso listas de jogos e erroganizar a lista posicionando seus jogos favoritos em qualquer posição de sua lista.
# Modelo conceitual DSList
![dslist-model](https://github.com/CarlosCardosoSilva/dslist/assets/93328383/99c02506-a311-4b85-ac7c-d4ac833f605b)

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
  
## Processo de deploy com CI/CD
- Back end: Railway
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git@github.com:CarlosCardosoSilva/dslist.git

cd backend

# executar o projeto
./mvnw spring-boot:run
```
# Autor

Juvenal Carlos Cardoso
