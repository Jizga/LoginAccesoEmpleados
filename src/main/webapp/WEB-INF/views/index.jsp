<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ES">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
div {
	text-align: center;
}
</style>

</head>
<body>

	<div>
		<h1>Estoy en los servicios rest del curso</h1>
		<h3>Login de Usuarios</h3>
		
		<form action="api/verLogin" method="post">
			Usuario:&nbsp; <input type="text" name="user"> 
			<br> 
			<br>
			Clave:&nbsp; <input type="password" name="password"> 
			<br>
			<br> 
			<input type="submit" value="Entrar">
		</form>

		<br> <br> <a href="api">pulsa aqui para ver los servicios</a>
	</div>
</body>
</html>