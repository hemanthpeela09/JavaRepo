<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result Page</title>
</head>
<body>
<html:form action="/getResult">
    
     <h3>Result list:</h3>
     <table align="center" border="1">  
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>EMAIL</td>
				<td>address</td>
			</tr>
		
		<logic:iterate name="UserResult" id="result" property="list">  
			<tr>	  
				<td><bean:write name="result" property="id"/></td>
				<td><bean:write name="result" property="name"/></td>
				<td><bean:write name="result" property="email"/></td>
				<td><bean:write name="result" property="address"/></td>
			</tr>
		</logic:iterate>  
			
	</table>
	<%-- <table>
		<tr>	
			<td>Showing results from <bean:write name="UserResult" property= "min"/> to <bean:write name="UserResult" property= "max"/> </td>
		</tr>
	</table> --%>
    <center><html:submit property="submit">Next</html:submit></center>
      
</html:form>
</body>
</html>