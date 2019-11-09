<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Register Form</h1>
<s:form method="post" action="register.do">
		<s:textfield name="name" label="UserName: " />
		<s:textfield name="email" label="Email: "/>
		<s:textfield name="phoneNo" label="Phone No: "/>
		<s:submit value="Register" name="submit" />
	</s:form>
	
	<s:property value="model.name"/><br>
	<s:property value="model.email"/><br>
	<s:property value="model.phoneNo"/>
</body>
</html>