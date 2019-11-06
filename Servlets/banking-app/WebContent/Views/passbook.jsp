<%@ page import="java.util.*"%>
<%@ page import="com.techlabs.model.BankTransaction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passbook</title>
</head>
<body>
	<h1 align="center">Passbook</h1>
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
	%>
	<%
		out.print(
				"<table style='text-align:center' border=3 align='center'><thead><th>Name</th><th>Amount</th><th>Transaction Type</th><th>Date</th></thead>");
		List<BankTransaction> passbookList = (List) request.getAttribute("passbooklist");
		out.print("<tbody>");
		for (BankTransaction bankTransaction : passbookList) {
			out.print("<tr><td> " + bankTransaction.getName() + "</td><td>" + bankTransaction.getAmount() + "</td><td>"
					+ bankTransaction.getType() + "</td><td>" + bankTransaction.getDate() + "</td>");
		}
		out.print("</tbody>");
		out.print("</table>");
	%>
	<form method="post" action="passbook">
		<input type="submit" value="Download">
	</form>
	
</body>
</html>