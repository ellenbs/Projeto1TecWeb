<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Novo Usuario</title>
</head>
<body>

<form action="cria_login" method='post'>
<label for="name">Usuario:</label><br>
<input type='text'  name = 'login' id="login"/><br>
<label for="name">Senha:</label><br>
<input type='text'  name = 'senha' id="senha"/><br>
<input type = 'submit' value = "criar usuario"/><br>
</form>

</body>
</html>