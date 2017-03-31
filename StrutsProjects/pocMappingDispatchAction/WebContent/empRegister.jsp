<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<pre>
		<h1><font color="red"><bean:message key="header"/></font></h1>
	
		<html:form action="/empreg" >
			<bean:message key="id"/>		<html:text property="id"/>
			<bean:message key="name"/>	    <html:text property="name"/>
			<bean:message key="email"/>		<html:text property="email"/>
			<bean:message key="address"/>	<html:textarea property="address"/>
			<html:submit property="register"><bean:message key="register"/></html:submit>
		</html:form>
	</pre>
	
	<a href="./changelang.do?language=te" >Telugu</a>
	<a href="./changelang.do?language=hi" >Hindi</a>
	<a href="./changelang.do?language=be" >Bengali</a>
	<a href="./changelang.do?language=en" >English</a>
	
</body>
</html>