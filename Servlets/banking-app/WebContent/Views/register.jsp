<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
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
	<%
		String userName = (String) request.getAttribute("inputUserName");
		String valid = (String) request.getAttribute("validate");
		if (valid == null)
			valid = "";
		if (userName == null)
			userName = "";
	%>

	<form style="padding-left: 500px; background-color: greenyellow"
		method="POST" action="register">
		<br>
		<h1 style="padding-left: 70px">Register Form</h1>
		<!--  <label style="color: red"></label><br>-->
		<table>
			<tr>
				<td><p>Name:</p></td>
				<td><p>
						<input id="textbox" type="text" name="username"
							placeholder="Enter Username" value="<%=userName%>"><span id="asterick1"
							style="color: red"></span>
					</p></td>
			</tr>

			<tr>
				<td><p>Password:</p></td>
				<td><p>
						<input id="password" type="password" name="password"
							placeholder="Enter Password"><span id="asterick2"
							style="color: red"></span>
					</p></td>
			</tr>

			<tr>
				<td><p>ReType-Password:</p></td>
				<td><p>
						<input id="repassword" type="password" name="repassword"
							placeholder="ReType Password"><span id="asterick3"
							style="color: red"></span>
					</p></td>
			</tr>

			<tr>
				<td><p>Opening Balance:</p></td>
				<td><p>
						<input id="openbalance" type="text" name="openbalance"
							placeholder="Enter opening balance"><span id="asterick4"
							style="color: red"></span>
					</p></td>
			</tr>

		</table>
		<br>
		<div style="padding-left: 95px">
			<button id="button" type="submit" onclick="return changeColor()">
				Register</button>
				<a href="login">Sign In</a>
		</div>
		<br> <br> <br>
	</form>
	<script>
		console.log(document.getElementById("textbox").value)
		var userName = document.getElementById("textbox")
		var password = document.getElementById("password")
		var rePassword = document.getElementById("repassword")
		var openBalance = document.getElementById("openbalance")
		function changeColor() {
			var counter = 0
			if (userName.value == undefined || userName.value == "") {
				userName.style.borderColor = "red"
				document.getElementById("asterick1").innerHTML = "*"
				counter++
			}
			if (password.value == undefined || password.value == "") {
				password.style.borderColor = "red"
				document.getElementById("asterick2").innerHTML = "*"
				counter++
			}
			if (rePassword.value == undefined || rePassword.value == "") {
				rePassword.style.borderColor = "red"
				document.getElementById("asterick3").innerHTML = "*"
				counter++
			}
			if (openBalance.value == undefined || openBalance.value == "") {
				openBalance.style.borderColor = "red"
				document.getElementById("asterick4").innerHTML = "*"
				counter++
			}
			if (counter == 1 || counter == 2 || counter == 3 || counter == 4)
				return false
			return true;
			console.log(document.getElementById("textbox").value)
		}
	</script>
</body>
</html>