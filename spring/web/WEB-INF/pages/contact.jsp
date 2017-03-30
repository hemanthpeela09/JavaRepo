<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring 3 MVC Series - Contact Manager</title>
</head>
<body bgcolor="#C7FBC5">
	<div align="center"> <br/>
	<h1>Spring MVC</h1><br/><br/><br/><br/>
	<h2>Contact Manager</h2>
<form:form method="post" action="addContact">
 	
    <table>
    <tr>
        <td><form:label path="contact.firstname">First Name</form:label></td>
        <td><form:input path="contact.firstname" /></td> 
    </tr>
    <tr>
        <td><form:label path="contact.lastname">Last Name</form:label></td>
        <td><form:input path="contact.lastname" /></td>
    </tr>
    <tr>
        <td><form:label path="contact.email">Email</form:label></td>
        <td><form:input path="contact.email" /></td>
    </tr>
    <tr>
        <td><form:label path="contact.telephone">Telephone</form:label></td>
        <td><form:input path="contact.telephone" /></td>
    </tr>
    <tr>
        <td><form:label path="address.email">Address Email</form:label></td>
        <td><form:input path="address.email" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Add Contact"/>
        </td>
    </tr>
</table>  
     
</form:form>
</div>
</body>
</html>