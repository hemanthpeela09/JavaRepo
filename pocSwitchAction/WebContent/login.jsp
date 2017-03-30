<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Default page</title>
</head>
<body>
<h1>Login form</h1>

<html:form action="/login">
<html:errors/>
<pre>
username: <html:text property="uname"/>
password: <html:password property="pwd"/>
role: <html:select property="role">
		<html:option value="admin">Admin</html:option>
		<html:option value="employee">Employee</html:option>
		<html:option value="user">User</html:option>
	  </html:select>
</pre>
	<html:submit value="Login..."/>
</html:form>
</body>
</html>