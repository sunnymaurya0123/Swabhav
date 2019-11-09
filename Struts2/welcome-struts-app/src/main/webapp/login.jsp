<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
#textbox {
	border-color: none;
}

#password {
	border-color: none;
}
</style>
</head>
<body>
<h1>Login Form</h1>
<s:form method="post" action="welcome">
		<s:textfield name="userName" label="UserName" />
		<s:textfield name="password" type="password" label="Password"/>
		<s:submit value="Login" name="submit" />
	</s:form>
</body>
</html>



