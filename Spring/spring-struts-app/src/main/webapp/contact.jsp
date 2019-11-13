<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts</title>
</head>
<body>
	<h1>This is Contact Page</h1>
	<table style='text-align:center' border=3 align='center'><thead><th>ID</th><th>Name</th><th>EmailId</th><th>Phone No</th></thead>
		<s:iterator value="contactList">
			<tr><td><s:property value="uuid" /><br></td>
			<td><s:property value="name" /><br></td>
			<td><s:property value="email" /><br></td>
			<td><s:property value="phoneNo" /><br></td></tr>
		</s:iterator>
	</table>
	<a href='add'>Add Contacts</a>
</body>
</html>