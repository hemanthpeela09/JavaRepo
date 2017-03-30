<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	

	<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
	<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login Page</title>
</head>
<body>
	<center>
		<h1>Login</h1>
		<html:form action="Login" onsubmit="return validateLoginForm(this)">
		<html:javascript formName="LoginForm"/>
			<table>
					<tr>
						<td>Username:</td>
						<td><html:text property="uname"> </html:text></td>
						
					</tr>
					<tr>
						<td>Password:</td>
						<td><html:password property="pwd"></html:password> </td>
						
					</tr>	
					<tr>
						
						<td><html:submit value="submit"></html:submit> </td>
						<td><html:reset value="reset" ></html:reset> </td> 	
					</tr>
						
			</table>
			<font color="red" style="font-style: "><html:errors/></font>
		</html:form>
		<br/>
		<br/>
		
		</center>
		
</body>
</html>