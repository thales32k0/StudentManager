# 📚 Student API

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-brightgreen?logo=spring-boot)](https://spring.io/projects/spring-boot)
[![Postman Tested](https://img.shields.io/badge/Tested%20with-Postman-orange?logo=postman)](https://www.postman.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](./LICENSE)
![Last Commit](https://img.shields.io/github/last-commit/thales32k0/StudentManager)

Uma API simples para gerenciar estudantes, construída com **Spring Boot** e pensada para fins de aprendizado.

---

## 🚀 Tecnologias

- ☕ Java 17+
- 🌱 Spring Boot 3
- 🌐 Spring Web
- 🗃️ Spring Data JPA
- 🛢️ H2 Database (em memória)
- ⚙️ Maven


---

## 🚀 Como rodar o projeto

### ✅ Pré-requisitos
- [Java 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou outro IDE

---

## 🔧 Como executar

1. Clone o repositório:
   ```bash
   
   git clone https://github.com/seu-usuario/student-api.git
   
   cd student-api


📬 Collection do Postman
Importe a collection abaixo para testar facilmente os endpoints da API:

- 📁 Importe a : [StudentApi.postman_collection.json](https://github.com/thales32k0/StudentManager/blob/main/StudentApi.postman_collection.json)

---

## 🗂️ Rotas da API

| Método | Endpoint       | Descrição               |
|--------|----------------|-------------------------|
| GET    | `/students`       | Listar todas as tarefas |
| POST   | `/students`       | Criar uma nova tarefa   |
| PUT    | `/students/{id}`  | Atualizar uma tarefa    |
| DELETE | `/students/{id}`  | Remover uma tarefa      |


3.Execute os métodos `GET`, `POST`, `PUT`, `DELETE` com os seguintes endpoints:

 - GET → `http://localhost:8080/students`
- POST → `http://localhost:8080/students` (body JSON)
- PUT → `http://localhost:8080/students/1`
- DELETE → `http://localhost:8080/students/1`

---

## 🗃️ Banco de Dados H2

- 🌐 URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- 🧬 JDBC: `jdbc:h2:mem:testdb`
- 👤 Usuário: `sa`
- 🔑 Senha: (deixe em branco)

---

## 👨‍💻 Autor
<table>
  <tr>
    <td><img src="https://avatars.githubusercontent.com/u/89024257?v=4" width="100"/></td>
    <td>
      <b>Thales Eduardo</b><br/>
      Aprendiz de tecnologia focado em Java ☕<br/>
      <a href="https://github.com/thales32k0">GitHub</a>
    </td>
  </tr>
</table>

---

## 📄 Licença
Este projeto está sob a licença [MIT](LICENSE).

