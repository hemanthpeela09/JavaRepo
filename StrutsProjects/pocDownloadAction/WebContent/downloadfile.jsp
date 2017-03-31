<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Download Page</title>
</head>
<body>
<pre>
	<html:link action="/file.do?filename=book">Download Struts Book</html:link>
	
	<html:link action="/file.do?filename=movie">Download Movie</html:link>
	
	<html:link action="/file.do?filename=image">Download Image</html:link>

</pre>

</body>
</html>