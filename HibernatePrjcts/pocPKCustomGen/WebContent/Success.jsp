<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://struts.apache.org/tags-bean"  prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align="center">
    <tr>
        <td colspan="2">Your registration has been done 
            successfully with below informations</td>
    </tr>
    <tr>
        <td>Account no: </td>
        <td><bean:write name="UserForm" property="acctno" /></td>
    </tr>
    <tr>
        <td>Name: </td>
        <td><bean:write name="UserForm" property="name" /></td>
    </tr>
    <tr>
        <td>Gender: </td>
        <td><bean:write name="UserForm" property="gender" /></td>
    </tr>
    <tr>
        <td>Email: </td>
        <td><bean:write name="UserForm" property="email" /></td>
    </tr>
    <tr>
        <td>Phone no: </td>
        <td><bean:write name="UserForm" property="mobile" /></td>
    </tr>
    <tr>
        <td>Address: </td>
        <td><bean:write name="UserForm" property="address" /></td>
    </tr>
    <tr>
        <td>UserName: </td>
        <td><bean:write name="UserForm" property="username" /></td>
    </tr>
    <tr>
        <td>Password: </td>
        <td><bean:write name="UserForm" property="password"/></td>
    </tr>
</table>
</body>
</html>