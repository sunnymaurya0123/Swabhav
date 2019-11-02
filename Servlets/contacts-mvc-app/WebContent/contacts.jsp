<%@ page import="java.util.*" %>
<%@ page import="com.techlabs.model.Contact" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts List</title>
</head>
<body>
<h1 align="center">Contacts List</h1>
	<%
		List<Contact> contacts=(List)request.getAttribute("contactlist");
		for(Contact contact:contacts){
			out.print("<br>FirstName: "+contact.getFirstName()
			+"&nbsp;&nbsp;LastName: "+contact.getLastName()
			+"&nbsp;&nbsp;EmailId: "+contact.getEmailId()
			+"&nbsp;&nbsp;Phone No: "+contact.getPhoneNo());
		}
	%>
	<br><br>
	<a href="http://localhost:8080/contacts-mvc-app/addContacts.jsp">Add Contacts</a>
</body>
</html>