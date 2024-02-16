# TODO List

## Sobre o projeto
API para gerenciar tarefas (CRUD), aula de API com @giulianabezerra

### Tecnologias

* Spring Boot
* Spring MVC
* Spring Data JPA
* Spring Doc OpenAPI 3
* MySQL

### Práticas adotadas

* SOLID, DRY, YAGNI, KISS
* API REST
* Consultas com Spring Data JPA
* Injeção de dependências
* Tratamento de respostas de erro
* Geração automática do Swagger com a OpenAPI 3

### Como executar

* Clonar repositório git
* Construir o projeto:

`$ ./mvnw clean package`

* Executar a aplicação:

`$ java -jar target/todolist-0.0.1-SNAPSHOT.jar`

A API poderá ser acessada em localhost:8080. 
O Swagger poderá ser visualizado em localhost:8080/swagger-ui.html

### API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta postman:

* Criar tarefa

Requisição POST: `localhost:8080/todos`

Body:
```
[
    {
        "descricao": "Desc Todo 1",
        "id": 1,
        "nome": "Todo 1",
        "prioridade": 1,
        "realizado": false
    }
]
```

* Listar tarefa

Requisição GET: `localhost:8080/todos`

* Atualizar tarefa

Requisição PUT: `localhost:8080/todos/1`

Body:
```
[
    {
        "descricao": "Desc Todo 1",
        "id": 1,
        "nome": "Todo 1",
        "prioridade": 1,
        "realizado": false
    }
]
```

* Remover tarefa

Requisição DELETE: `localhost:8080/todos/1`
