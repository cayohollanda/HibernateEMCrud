<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usuários</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
	<div align="center" style="margin-top: 10px">
		<table class="table" style="width: 50%">
			<thead class="thead-dark">
				<tr>
					<th>#</th>
					<th>Login</th>
					<th>Senha</th>
					<th>Ações</th>
				</tr>			
			</thead>

			<c:forEach var="usuario" items="${usuarios}">
				<tr>
					<td>${usuario.id}</td>
					<td>${usuario.login}</td>
					<td>${usuario.senha}</td>
					<td colspan="2"><a href="alteraUsuario?id=${usuario.id}">Editar</a>
						| <a href="removeUsuario?id=${usuario.id}">Apagar</a></td>
				</tr>
			</c:forEach>
		</table>
		
		<br>
		
		<a href="index.jsp">Voltar para Início</a>
	</div>
</body>
</html>