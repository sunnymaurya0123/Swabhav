<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contacts</title>
</head>
<body>
	<%
		String firstName = (String) request.getAttribute("inputFirstName");
		String lastName = (String) request.getAttribute("inputLastName");
		String emailId = (String) request.getAttribute("inputEmailId");
		String phoneNo = (String) request.getAttribute("inputPhoneNo");
		String valid = (String) request.getAttribute("validate");
		if (valid == null)
			valid = "";
		if (firstName == null)
			firstName = "";
		if (lastName == null)
			lastName = "";
		if (emailId == null)
			emailId = "";
		if (phoneNo == null)
			phoneNo = "";
	%>
	<form method="post" action="add">
		Enter First Name: <input type="text" name="firstname" value="<%=firstName%>"><br>
		<br> Enter Last Name: <input type="text" name="lastname" value="<%=lastName%>"><br>
		<br> Enter Email Id: <input type="text" name="emailid" value="<%=emailId%>"><br>
		<br> Enter Phone No: <input type="text" name="phoneno" value="<%=phoneNo%>"><br>
		<br> <label style="color: red;" name="validation"><%=valid%></label><br>
		<br> <input type="submit" name="Add" value="Submit">
	</form>
</body>
</html>