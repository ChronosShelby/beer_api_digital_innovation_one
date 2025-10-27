# 🍺 Beer API - Digital Innovation One

Uma **API REST** para gerenciar dados de cervejas, desenvolvida como projeto do bootcamp **Digital Innovation One**.  
Permite realizar operações de **CRUD (Create, Read, Update, Delete)** em registros de cervejas, ideal para sistemas de catálogo ou controle de estoque.

---

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot** – Framework para criar aplicações Java robustas e escaláveis.
- **Spring Data JPA** – Abstração para facilitar interações com o banco de dados.
- **H2 Database** – Banco de dados em memória para desenvolvimento e testes rápidos.
- **Postman** – Documentação interativa da API.
- **Maven Wrapper** – Gerenciador de dependências e construção do projeto.

---

## 💻 Pré-requisitos

Antes de rodar a aplicação, é necessário ter instalado:

- Java 21 ou superior
- Maven (opcional, pois o projeto utiliza o Maven Wrapper)

---

## ⚡ Como Rodar Localmente

1. **Execute a suíte de testes:**

```shell script
mvn clean test
```

2. **execute o projeto no terminal:**

```shell script
mvn spring-boot:run
```

3. **Após executar os comando acima, acesse o POSTMAN pelo seguinte link:**

```
http://localhost:8080/api/v1/beers
```

---

## 🛠️ Principais Endpoints

| Método | Endpoint             | Descrição                      |
| ------ | -------------------- | ------------------------------ |
| GET    | `/api/v1/beers`      | Listar todas as cervejas       |
| GET    | `/api/v1/beers/{id}` | Buscar cerveja pelo ID         |
| POST   | `/api/v1/beers`      | Adicionar nova cerveja         |
| PUT    | `/api/v1/beers/{id}` | Atualizar dados de uma cerveja |
| DELETE | `/api/v1/beers/{id}` | Remover cerveja pelo ID        |

> Todos os dados devem ser enviados no formato **JSON**.

---

## 🧪 Testes

O projeto inclui testes unitários e de integração para garantir que os endpoints funcionem corretamente.  
Execute os testes com:

```shell script
mvn clean test
```
