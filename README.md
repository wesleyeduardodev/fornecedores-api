
- Rodar Docker compose para criar o banco de dados: docker compose up -d
- Gerar Imagem: docker build -t wesleyeduardodev/fornecedor-api .
- Rodar Docker compose ambiente test: docker compose -f docker-compose-test.yml up -d

## Swagger
- http://localhost:8081/fornecedor-api/swagger-ui/index.html


## Ajustes
- Subir insert data.sql ao iniciar a aplicação
- Inerir basicAuth
- Inserir configuracao de volumes para o banco postgres
