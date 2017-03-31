<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>    
 <%@ taglib uri="http://struts.apache.org/tags-bean"  prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<html:form action="/getResult">
<table align="center">
    <tr>
        <td colspan="2">Your registration has been done 
            successfully with below informations</td>
    </tr>
    <tr>
    	<td><input type="submit" value="submit"/></td>
    </tr>
</table>
</html:form>
</body>
</html>