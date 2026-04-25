Checkpoint 2 - API de Pedidos (Spring Boot)
 Integrantes do Grupo
Kauê Pires Moreira — RM 554403
Ricardo Di Tilia — RM 555155
Eric Yuji Ito — RM 554869
Higor Batista — RM 558907

 Descrição do Projeto

Este projeto consiste no desenvolvimento de uma API REST utilizando Spring Boot, com o objetivo de gerenciar pedidos.

A aplicação permite realizar operações completas de CRUD (Create, Read, Update, Delete), seguindo boas práticas de arquitetura em camadas:

Controller
Service
Repository
Model
 Tecnologias Utilizadas
Java 21
Spring Boot 3.5.14
Spring Data JPA
H2 Database (banco em memória)
Maven
 Estrutura do Projeto
src/main/java/br/com/fiap/checkpoint2
│
├── controller
├── service
├── repository
└── model
 Funcionalidades

A API possui os seguintes endpoints:

 Criar Pedido
POST /pedidos
 Listar Todos os Pedidos
GET /pedidos
 Buscar Pedido por ID
GET /pedidos/{id}
 Atualizar Pedido
PUT /pedidos/{id}
 Deletar Pedido
DELETE /pedidos/{id}
 Exemplo de Requisição (POST)
{
  "clienteNome": "Kaue Pires",
  "valorTotal": 200.00
}
 Banco de Dados

O projeto utiliza o H2 Database em memória.

 Acesso ao console:
http://localhost:8080/h2-console
 Configuração:
JDBC URL: jdbc:h2:mem:pedidos-db
User: sa
Password: ()
⚙️ Como Executar o Projeto
Clonar o repositório:
git clone https://github.com/seu-usuario/seu-repositorio.git
Abrir na IDE (IntelliJ ou VS Code)
Rodar a aplicação:
mvn spring-boot:run
A API estará disponível em:
http://localhost:8080
🧠 Observações
O ID do pedido é gerado automaticamente.
A data do pedido é preenchida automaticamente no momento da criação.
O campo clienteNome é obrigatório.
O valorTotal não pode ser negativo.
📌 Status

✅ Projeto finalizado
✅ CRUD completo funcionando
✅ Testado via Postman

🔗 Link do Repositório

(cole aqui o link do GitHub antes de entregar)
