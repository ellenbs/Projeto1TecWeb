<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Criar Task</title>
</head>
<body>

<form action="cria" method='post'>
<label for="name">Task:</label><br>
<input type='text'  name = 'task' id="task"/><br>
<label for="name">Materia:</label><br>
<input type='text'  name = 'materia' id="materia"/><br>
<label for="name">Usuario:</label><br>
<input type='text'  name = 'login' id="login"/><br>
<input type = 'submit' value = "criar task"/><br>
</form>

</body>
</html>