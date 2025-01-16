# Spring-ToDoList

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=white)](https://swagger.io/)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue)](http://www.apache.org/licenses/LICENSE-2.0.html)

Esse repositório armazena um sistema de gerenciamento de tarefas (To-Do List), desenvolvido por mim, me guiando por [esse vídeo](https://www.youtube.com/watch?v=IjProDV001o&list=PLiFLtuN04BS0pzDbDiuSh-Mt-ifgiiogs&index=2) como parte de um desafio para vaga de Desenvolvedor Backend JR([Link do desafio](https://github.com/simplify-tec/desafio-junior-backend-simplify)).

---

## Descrição

A aplicação permite que os usuários realizem o gerenciamento de tarefas por meio de um sistema CRUD (Create, Read, Update, Delete). As funcionalidades principais incluem:

- Criar tarefas com informações detalhadas
- Visualizar todas as tarefas cadastradas
- Editar tarefas existentes
- Excluir tarefas

Cada tarefa possui os seguintes campos mínimos:
- **Name**: Nome da tarefa
- **Description**: Detalhes da tarefa
- **itsRealized**: Indica se a tarefa foi concluída
- **Priority**: Prioridade da tarefa

---

## Requisitos

Para construir e executar a aplicação, você precisará de:

- [JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven 3](https://maven.apache.org/)
- [MySQL 8.0](https://dev.mysql.com/downloads/mysql/)

---

## Configuração do Ambiente

1. Clone este repositório:

   ```bash
   git clone https://github.com/EnzoLFranco/Spring-ToDoList.git
   cd Spring-ToDoList
   ```

2. Configure o banco de dados MySQL:
   - Crie um banco de dados chamado `todolist`
   - Atualize as credenciais do banco no arquivo `application.properties` localizado em `src/main/resources/`.

3. Execute a aplicação com o Maven:

   ```bash
   mvn spring-boot:run
   ```

4. Acesse a aplicação no navegador em: `http://localhost:8080`

---

## Documentação da API

A aplicação utiliza o Swagger para documentar as APIs. Após iniciar o servidor, a documentação estará disponível em:

```
http://localhost:8080/swagger-ui/index.html
```

---

## Funcionalidades Principais

1. **Criar Tarefa**: Permite criar novas tarefas com nome, descrição, status e prioridade.
2. **Visualizar Tarefas**: Lista todas as tarefas cadastradas no banco de dados.
3. **Editar Tarefa**: Atualiza informações de uma tarefa existente.
4. **Excluir Tarefa**: Remove uma tarefa do sistema.

---

## Licença

Este projeto está licenciado sob a [Licença Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).
