<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Repaso de Examen</title>
</head>
<body>

<a href="/registro" style="text-align: right; display: block"> Registrarse </a>

<h1>Repaso de Examen</h1><hr><br><br>

<form style="text-align: center" action="/" method="POST" >
    
    <h3>Buscar Lugares</h3>         
    <input type="text" path="texto"/>
    <input type="submit" value="Buscar"/>      
    
</form> 

</body>
</html>