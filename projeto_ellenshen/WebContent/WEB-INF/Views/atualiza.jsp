<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atualizar</title>
</head>
<body>

<form action="atualiza" method = 'post'>
<label for="name">Task:</label><br>
<input type='text'  name = 'task' value = "${param.task}"/><br>
<label for="name">Materia:</label><br>
<input type='text' name='materia' value="${param.materia}"><br>
<label for="name">Usuario:</label><br>
<input type='text' name='login' value="${param.login}"><br>
<input type='hidden' name='id' value='${param.id}'>
<input type = 'submit' value = "atualizar"/><br>
</form>

</body>
</html>