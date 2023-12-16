
- Rodar Docker compose para criar o banco de dados: docker compose up -d
- Gerar Imagem: docker build -t wesleyeduardodev/fornecedor-api .
- Rodar Docker compose ambiente test: docker compose -f docker-compose-test.yml up -d
- Remover todos os containers: docker rm $(docker ps -a -q) -f
- Remover todos as imagens: docker rmi $(docker images -q) -f
- Remover todos os volumes: docker volume rm $(docker volume ls -qf dangling=true)
- docker logs --follow fornecedores-api
- 
## Swagger
- http://localhost:8081/fornecedor-api/swagger-ui/index.html


## Ajustes
- Subir insert data.sql ao iniciar a aplicação
- Inerir basicAuth
- Inserir configuracao de volumes para o banco postgres
