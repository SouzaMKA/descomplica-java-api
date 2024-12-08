## Descomplica API

### HTTPS:
```bash
git clone https://github.com/Danmendua/descomplica-java-api.git
```

### SSH:
```bash
git clone git@github.com:Danmendua/descomplica-java-api.git
```

Após o clone do repositório, basta rodar o comando abaixo:
```bash
mvn spring-boot:run
```

Endpoint para acessar o swagger:
http://localhost:8080/swagger-ui/index.html

Endpoint para acessar o console do H2:
http://localhost:8080/h2-console
```
JDBC URL: jdbc:h2:mem:testdb
User Name: as
Password: password
```

Em seguida é só usar os comandos SQL para popular o banco de dados e testar os endpoints com as descrições de consulta.

Exemplo Projeto:
```
http://localhost:8080/projetos?descricao=Projeto%20de%20Testes
```
Exemplo Recurso:
```
http://localhost:8080/recursos?nome=Recurso%20B
```
Exemplo Tarefa:
```
http://localhost:8080/tarefas?status=Completa
```
