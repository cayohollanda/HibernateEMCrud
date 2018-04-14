<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
	<div class="container" align="center" style="margin-top: 10%">
		<form action="cadUsuario" method="POST">
			<input type="hidden" name="id" value="${usuario.id}" />
		
			<div class="card">
				<div class="card-header">Cadastrar/Alterar Usuário</div>
				
				<div class="card-body">
					<div class="form-group row">
						<label for="login">Usuário: </label>
						<input type="text" class="form-control" name="login" value="${usuario.login}" /> <br>
					</div>
					
					<div class="form-group row">
						<label for="senha">Senha: </label>
						<input type="password" class="form-control" name="senha" value="${usuario.senha}" /> <br>
					</div>
					
					<div class="form-group">
						<input type="submit" class="btn btn-outline-success" value="Salvar" />
						<input type="reset" class="btn btn-outline-primary" value="Limpar" />
					</div>
					
					<a href="index.jsp">Voltar ao Início</a>
				</div>
			</div>
		</form>
	</div>
</body>
</html>