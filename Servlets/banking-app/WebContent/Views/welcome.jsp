<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome To Union Bank</h1>
	<%
		String userName = (String) session.getAttribute("userName");
		double userBal = (Double) session.getAttribute("userBal");
		String welcomeUser = (String) session.getAttribute("welcomeUser");
		if (userName != null && !userName.equals("")) {
	%>
	<div align="right">
		<button align="right">
			<a href="http://localhost:8080/banking-app/logout">Logout</a>
		</button>
	</div>
	<label><%=welcomeUser%></label>
	<div align="center">
		<label>Your Account Balance is: <%=userBal%></label>
	</div>
	<%
		}
	%>
	<br><br>
	<div align="center">
	<a href="transaction">Transaction</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="passbook">Passbook</a>
	</div>
</body>
</html>