<%@ page import="java.util.*"%>
<%@ page import="com.techlabs.model.Contact"%>
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
		String userName = (String) session.getAttribute("userName");
		String welcomeUser = (String) session.getAttribute("welcomeUser");
		if (userName != null && !userName.equals("")) {
	%>
	<div align="right">
		<button align="right">
			<a href="http://localhost:8080/contacts-mvc-app/logout">Logout</a>
		</button>
	</div>
	<label><%=welcomeUser%></label>
	<%
		}
	%>

	<br>
	<%
		out.print(
				"<table style='text-align:center' border=3 align='center'><thead><th>FirstName</th><th>LastName</th><th>EmailId</th><th>Phone No</th><th>Update Info</th><th>Remove Info</th></thead>");
		List<Contact> contacts = (List) request.getAttribute("contactlist");
		out.print("<tbody>");
		for (Contact contact : contacts) {
			out.print("<tr><td> " + contact.getFirstName() + "</td><td>" + contact.getLastName() + "</td><td>"
					+ contact.getEmailId() + "</td><td>" + contact.getPhoneNo() + "</td>");
			out.print("<td><a href='edit?id=" + contact.getId() + "'>Edit</a></td>");
			out.print("<td><a href='delete?id=" + contact.getId() + "'>Delete</a></td></tr>");
		}
		out.print("</tbody>");
		out.print("</table>");
	%>
	<br>
	<a href='http://localhost:8080/contacts-mvc-app/add'>Add Contacts</a>
</body>
</html>