<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contacts</title>
</head>
<body>
	
	<s:form method="post" action="add.do">
		<s:textfield name="name" label="Enter Name" />
		<s:textfield name="email" label="Enter Email Id" />
		<s:textfield name="phoneNo" label="Enter Phone No" />
		<s:label style="color: red;" name="validation"></s:label>
		<s:submit value="Submit" name="submit" />
	</s:form>
</body>
</html>