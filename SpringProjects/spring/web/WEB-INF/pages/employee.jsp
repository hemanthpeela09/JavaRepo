<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
    <title>Spring 3 MVC</title>
</head>
<body bgcolor="#C7FBC5">
	<div align="center"> <br/>
	<h1>Spring MVC</h1><br/><br/><br/><br/>
	<h2>Employee Manager</h2>
<form method="post" action="employeedetails">
 	<table>
    <tr>
        <td>Associate ID</td>
        <td><input type="text" name="associateid"/></td> 
    </tr>
    <tr>
        <td>Department</td>
        <td><input type="text" name="department"/></td>
    </tr>
    <tr>
        <td>Email</td>
        <td><input type="text" name="email"/></td> 
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Add Contact"/>
        </td>
    </tr>
</table>     
</form>
</div>
</body>
</html>