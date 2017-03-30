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
	Employee Details (accessed through map)
	<table border="1">
		<tr><td>Associate ID</td> <td>${employeedetails['employee'].associateid}</td></tr>
		<tr><td>Department</td> <td>${employeedetails['employee'].department}</td></tr>
		<tr><td>contact email</td> <td>${employeedetails['contact'].email}</td></tr>		
	</table> <br/> <br/>
	Employee Details (accessed through contact and employee objects)
	<table border="1">
		<tr><td>Associate ID</td> <td>${employee.associateid}</td></tr>
		<tr><td>Department</td> <td>${employee.department}</td></tr>
		<tr><td>contact email</td> <td>${contact.email}</td></tr>		
	</table>
	</div>
</body>
</html>