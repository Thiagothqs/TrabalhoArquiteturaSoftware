<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Empregado</title>
</head>
<body>
	<form action="EmpregadoServlet" method="post">
		Nome: <input type="text" id="nome" name="nome" value=""/>
		CPF: <input type="text" id="cpf" name="cpf" value=""/>
		Função: <input type="text" id="funcao" name="funcao" value=""/>
		Estado: <input type="text" id="estado" name="estado" value=""/>
		Cidade: <input type="text" id="cidade" name="cidade" value=""/>
		
		<input type="submit" value="Entrar">
	</form>
</body>
</html>