<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Welcome</title>
</head>
 
<body>
    <h2>Howdy, <s:property value="username" />...!</h2>
    <h3>Registration success</h3>
    <h4>User Details</h4>
    <table>
    	<tr>
    		<td> <s:label key="name"/> </td>
    		<td><s:property value="name"/> </td>
    	</tr>
    	<tr>
    		<td> <s:label key="email"/> </td>
    		<td><s:property value="email"/> </td>
    	</tr>
    	<tr>
    		<td> <s:label key="phone"/> </td>
    		<td><s:property value="phone"/> </td>
    	</tr>
    	<tr>
    		<td> <s:label key="gender"/> </td>
    		<td><s:property value="gender"/> </td>
    	</tr>
    	<tr>
    		<td> <s:label key="age"/> </td>
    		<td><s:property value="age"/> </td>
    	</tr>
    </table>
</body>
</html>