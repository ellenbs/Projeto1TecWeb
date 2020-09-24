<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Entrar</title>
</head>
<body>

<form action="entrar" method='post'>
<label for="name">Usuario:</label><br>
<input type='text'  name = 'login' value="${param.login}"/><br>
<label for="name">Senha:</label><br>
<input type='text'  name = 'senha'/><br>
<input type="hidden" name="id" value="${param.id}">
<input type = 'submit' value = "entrar"/><br>
</form>

</body>
</html>