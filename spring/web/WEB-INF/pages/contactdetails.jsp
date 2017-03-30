<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="form.Contact" %>    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#C7FBC5">
	<div align="center"> <br/>
	<h1>Spring MVC</h1><br/><br/><br/><br/>
	<% Contact contact = (Contact) request.getAttribute("contact"); %>
	Contact Details
	<table border="1">
		<tr><td>First Name</td> <td>${contact.firstname}</td></tr>
		<tr><td>Last Name</td> <td>${contact.lastname}</td></tr>
		<tr><td>email</td> <td>${contact.email}</td></tr>
		<tr><td>telephone</td> <td>${contact.telephone}</td></tr>
		<tr><td>address email</td> <td>${address.email}</td></tr>
	</table>
	</div>
</body>
</html>