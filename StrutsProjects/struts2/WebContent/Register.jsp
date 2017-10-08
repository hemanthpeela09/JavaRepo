<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Page</title>
<s:head/>
</head>
<body>
  <h1>Registration Page</h1>
  <h2>Please Enter User Details</h2>
  <s:actionerror/>
<s:form action="register.action" method="post">  
<s:textfield name="name" key="label.name" size="20"/>  
<s:textfield name="phone" key="label.password" size="20"/>  
<s:textfield name="email" key="email" size="20"/>
<s:textfield name="age" key="age" size="3"/>
<s:radio name="gender" key="gender" list="{'male','female'}"/>  
<s:select list="{'india','pakistan','other'}"  
name="country" key="Country" />  
  
<s:submit value="register"></s:submit>  
  
</s:form>  

</body>
</html>