<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Welcome</h1>
<s:form method="post" action="logout">
<s:property value="message"/>
<s:submit value="Log Out" name="submit" />
</s:form>
</body>
</html>