<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC</title>
</head>
<body bgcolor="#C7FBC5">
	<div align="center"> <br/>
	<h1>Spring MVC</h1><br/><br/><br/><br/>
	<form action="welcome">
	User Name: 
	<input type="text" name="username">
	<input type="submit" value="submit">
	</form>
	<br/> <h3>File Upload and Download</h3>
 	<form method="post" action="fileUploadForm"
        enctype="multipart/form-data">
		
		Please select a file to upload : <input type="file" name="file" />
		<input type="submit" value="upload" />
 
	</form>
	</div>
</body>
</html>