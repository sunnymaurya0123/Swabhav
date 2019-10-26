<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name=(String)request.getAttribute("inputName");
		String cgpi=(String)request.getAttribute("inputCgpi");
		String valid=(String)request.getAttribute("validate");
		int id=(Integer)request.getAttribute("studentID");
		if(valid==null)
			valid="";
		if(name==null)
			name="";
		if(cgpi==null)
			cgpi="";
	%>
	<form method="post" action="edit?id=<%=id%>">
		Id: <label name="id"><%=id%></label><br><br>
		Enter Name: <input type="text" name="Name" value="<%=name%>"><br><br>
		Enter CGPI: <input type="text" name="Cgpi" value="<%=cgpi%>"><br><br>
		<label style="color: red;" name="validation"><%=valid %></label><br><br>
		<input type="submit" name="Add" value="Update">
	</form>
</body>
</html>