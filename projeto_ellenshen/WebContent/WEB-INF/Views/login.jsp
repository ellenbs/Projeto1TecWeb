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
<title>Login</title>
</head>
<body>

<table border="1">

<tr>
<td>Usuarios</td>

<td><form action="cria_login" method="get">
<input type="hidden" name="id" value="${user.login}">
<input type="submit" value="criar usuario">
</form></td>
</tr>

<c:forEach var="user" items="${users}">
<tr>

<td>${user.login}</td>

<td><form action="entrar" method="get">
<input type="hidden" name="id" value="${user.id}">
<input type="hidden" name="login" value="${user.login}">
<input type="hidden" name="senha" value="${user.senha}">
<input type="submit" value="entrar">
</form></td>

<td><form action="atualiza_user" method="get">
<input type="hidden" name="id" value="${user.id}">
<input type="hidden" name="login" value="${user.login}">
<input type="hidden" name="senha" value="${user.senha}">
<input type="submit" value="atualizar">
</form></td>

<td><form action="remove_user" method="post">
<input type="hidden" name="id" value="${user.id}">
<input type="submit" value="remover usuario">
</form></td>

</tr>
</c:forEach>
</table>

</body>
</html>