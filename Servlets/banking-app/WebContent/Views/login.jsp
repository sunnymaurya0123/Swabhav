<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
#textbox {
	border-color: none;
}

#password {
	border-color: none;
}
</style>
</head>
<body style="background-color: lightseagreen;">
	<jsp:useBean class="com.techlabs.listeners.EventListeners"
		id="sessionCounter" scope="application" />
	<UL>
		<LI>Total number of visitor: <jsp:getProperty
				name="sessionCounter" property="visitorCount" />. <LI>Number of active users: <jsp:getProperty
				name="sessionCounter" property="activeUsersCount" />
</LI>
</UL>
	<%
		String errormsg = (String) request.getAttribute("errorMsg");
		if (errormsg == null)
			errormsg = "";
	%>
			<form style="padding-left: 500px; background-color: greenyellow"
				method="POST" action="login">
		<br>
		<h1>Login Form</h1>
		<br>
		<label style="color: red"><%=errormsg%></label><br> 
		<span>Username: </span><input id="textbox" type="text" name="username"
					placeholder="Enter Username"><span id="asterick1"
					style="color: red"></span><br>
		<br> 
		<span>Password: </span><input id="password" type="password"
					name="password" placeholder="Enter Password"><span
					id="asterick2" style="color: red"></span><br>
		<br>
		<button id="button" type="submit" onclick="return changeColor()">
			Submit</button>
		<a href="register">Sign Up</a>
		<br>
		<br>
		<br>
	</form>
	<script>
		console.log(document.getElementById("textbox").value)
		function changeColor() {
			var counter = 0
			if (document.getElementById("textbox").value == undefined
					|| document.getElementById("textbox").value == "") {
				document.getElementById("textbox").style.borderColor = "red"
				document.getElementById("asterick1").innerHTML = "*"
				counter++
				// return false
			}
			if (document.getElementById("password").value == undefined
					|| document.getElementById("password").value == "") {
				document.getElementById("password").style.borderColor = "red"
				document.getElementById("asterick2").innerHTML = "*"
				counter++
				// return false
			}
			if (counter == 1 || counter == 2)
				return false
			return true;
			console.log(document.getElementById("textbox").value)
		}
	</script>

		</body>
</html>



