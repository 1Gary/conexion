<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/PersonaController" method="get">
	<label> Nombres: </label>
	<input type="text" value=""  name="nombres"/> <br>
	<label> Apellidos: </label>
	<input type="text" value=""  name="apellidos"/> <br>
	<label> Edad: </label>
	<input type="text" value=""  name="edad"/> <br>
	<label> Hobbies: </label>
	<input type="text" value=""  name="hobbies"/> <br>
	
	<input type="submit" value="Submit">   
</form>	

<a href="<%=request.getContextPath()%>/PersonaController?page=lista" >Ver lista de Personas</a>


</body>
</html>