<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction</title>
</head>
<body>
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
	<%
		}
	%><br><br>
	<form method="post" action="transaction">
		Enter Amount: <input type="text" name="amount"
			placeholder="Enter Amount"><br> <br> <input
			type="radio" name="transaction" value="D">Deposit&nbsp;&nbsp;
		<input type="radio" name="transaction" value="W">Withdraw <br>
		<br>
		<input type="submit">
	</form>
</body>
</html>