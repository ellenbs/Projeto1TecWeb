<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@page import="java.util.*"%>
    <%@page import="projeto.controllers.*"%>
    <%@page import="projeto.model.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tasks</title>
</head>
<body>

<table border="1">
<tr>
<td>Task</td>

<td>Materia</td>

<td>Usuario</td>

<td></td>

<td><form action="cria" method="get">
<input type="hidden" name="id" value="${topico.id}">
<input type="hidden" name="login" value="${user.login}">
<input type="submit" value="criar task">
</form></td>

</tr>
<c:forEach var="topico" items="${topicos}">

<tr>

<td>${topico.task}</td>

<td>${topico.materia}</td>

<td>${topico.login}</td>

<td><form action="atualiza" method="get">
<input type="hidden" name="id" value="${topico.id}">
<input type="hidden" name="task" value="${topico.task}">
<input type="hidden" name="materia" value="${topico.materia}">
<input type="hidden" name="materia" value="${topico.login}">
<input type="submit" value="atualizar">
</form></td>

<td><form action="remove" method="post">
<input type="hidden" name="id" value="${topico.id}">
<input type="submit" value="remover">
</form></td>

</tr>
</c:forEach>
</table>
</body>
</html>