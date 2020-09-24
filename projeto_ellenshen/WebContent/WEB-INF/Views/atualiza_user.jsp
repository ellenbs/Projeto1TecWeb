<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atualizar Dados</title>
</head>
<body>

<form action="atualiza_user" method='post'>
<label for="name">Usuario:</label><br>
<input type='text'  name = 'login' value="${param.login}"/><br>
<label for="name">Nova Senha:</label><br>
<input type='text'  name = 'senha'/><br>
<input type='hidden' name='id' value='${param.id}'>
<input type = 'submit' value = "atualizar usuario"/><br>

</form>
</body>
</html>