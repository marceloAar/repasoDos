<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Registrarse</title>
</head>
<body>

<h1>Registrarse</h1>

<form action="/registrar" method="post" modelAttribute="usuarios" >
    <p>
        <label path="nombre">Nombre :</label>
        
        <input path="nombre"/>
    </p>
    <p>
        <label path="apellido">Apellido :</label>
        
        <input path="apellido"/>
    </p>
    <p>
        <label path="email">Email :</label>
        
        <input path="email"/>
    </p>
    <p>
        <label path="password">Password :</label>
         
        <input type="password" path="password"/>
    </p>  
    <p>
        <label path="passConfirmacion">Confirma Password :</label>
             
        <input type="password" path="passConfirmacion"/>
    </p>
      
    <input type="submit" value="Submit"/>
</form> 	

</body>
</html>