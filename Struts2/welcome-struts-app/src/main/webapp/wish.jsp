<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wish</title>
</head>
<body>
	
	<s:form method="post" action="wish.do">
		<s:textfield name="userName" label="Name" value="Sunny" />
		<s:submit value="Wish" name="submit" />
	</s:form>
	<s:property value="message" />
</body>
</html>