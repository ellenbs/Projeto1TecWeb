# Projeto1 TecWeb
## Aluna: Ellen Beatriz Shen

Para criar o banco de dados os seguintes comandos devem ser digitados no mySQL

```
CREATE DATABASE projeto1;
USE projeto1;
CREATE TABLE Topicos (id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, task VARCHAR(50) NOT NULL, materia VARCHAR(50) NOT NULL, login VARCHAR(50) NOT NULL);
INSERT INTO Topicos (task,materia,login) VALUES ('Fazer APS','ModCon','ellenbs');
INSERT INTO Topicos (task,materia,login) VALUES ('Continuar Projeto','CamadaFis','ellenbs');
INSERT INTO Topicos (task,materia,login) VALUES ('Estudar','FisMov','enzocasn');
```
```
CREATE TABLE Users (id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, login VARCHAR(50) NOT NULL, senha INT NOT NULL);
INSERT INTO Topicos (login,senha) VALUES ('ellenbs',12345);
INSERT INTO Topicos (login,senha) VALUES ('enzocasn',54321);
INSERT INTO Topicos (login,senha) VALUES ('gabimb',45678);
```

## Antes de rodar o projeto, trocar a linha 22 dos arquivos DAO.java e DAO_Login.java para o usuario certo do seu mySQL



