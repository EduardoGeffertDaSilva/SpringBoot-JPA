# 📋 API REST - Gerenciamento de Tarefas

API RESTful desenvolvida com Spring Boot, Spring Data JPA e MySQL para gerenciamento de tarefas (CRUD). O projeto conta com tratamento de exceções personalizado, documentação interativa via Swagger (Springdoc OpenAPI) e suporte a testes via Postman.

---

## 🛠️ Tecnologias Utilizadas

* **Java 21** (ou superior)
* **Spring Boot 3.x**
    * Spring Web
    * Spring Data JPA
* **MySQL** (Banco de dados relacional)
* **Springdoc OpenAPI UI** (Documentação Swagger)
* **Maven** (Gerenciador de dependências)
* **Postman** (Testes de endpoints)

---

## 📁 Estrutura do Projeto

```text
src/main/java/com/exemplo/tarefas/
├── controller/
│   └── TarefaController.java        # Endpoints HTTP da API
├── service/
│   └── TarefaService.java           # Regras de negócio da aplicação
├── repository/
│   └── TarefaRepository.java        # Interface JPA para acesso ao banco
├── model/
│   └── Tarefa.java                  # Entidade JPA mapeada para o MySQL
├── exception/
│   └── ResourceNotFoundException.java # Exceção customizada (HTTP 404)
└── TarefasApplication.java          # Classe principal da aplicação