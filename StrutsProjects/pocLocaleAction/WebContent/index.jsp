<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<bean:message key="name"/>

<pre>
	<a href="./locale.do?language=en&country=IN&page=/index.jsp">Click for English</a>
	<a href="./locale.do?language=te&country=IN&page=/index.jsp">Click for Telugu</a>
	<a href="./locale.do?language=hi&country=IN&page=/index.jsp">Click for Hindi</a> 
</pre>
</body>
</html>