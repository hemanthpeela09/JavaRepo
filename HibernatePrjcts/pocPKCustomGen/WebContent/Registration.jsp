<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Page</title>
</head>
<body>
<html:form action="/regAction">
    <table align="center">
        <tr>
            <td>Name: </td>
            <td><html:text property="name"></html:text></td>
        </tr>
        <tr>
            <td>Gender: </td>
            <td>
                <html:select property="gender">
                    <html:option value="">Select</html:option>
                    <html:option value="MALE">Male</html:option>
                    <html:option value="FEMALE">Female</html:option>
                </html:select>
            </td>
        </tr>
        <tr>
            <td>Email: </td>
            <td><html:text property="email"></html:text></td>
        </tr>
        <tr>
            <td>Phone no: </td>
            <td><html:text property="mobile"></html:text></td>
        </tr>
        <tr>
            <td>Address: </td>
            <td><html:text property="address"></html:text></td>
        </tr>
        <tr>
            <td>Username: </td>
            <td><html:text property="username"></html:text></td>
        </tr>
        <tr>
            <td>Password: </td>
            <td><html:password property="password"></html:password></td>
        </tr>
        <tr>
            <td><html:submit property="submit">Submit</html:submit></td>
            <td><html:reset property="reset">Reset</html:reset></td>
        </tr>
    </table>
</html:form>
</body>
</html>