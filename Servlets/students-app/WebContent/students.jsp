<%@ page import="java.util.*" %>
<%@ page import="com.techlabs.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students List</title>
</head>
<body>
	<h1 align="center">Students List</h1>
	<%
		List<Student> students=(List)request.getAttribute("studentlist");
		for(Student student:students){
			out.print("<br>Name: "+student.getName()+"&nbsp;&nbsp;ID: "+student.getId()+"&nbsp;&nbsp;CGPI: "+student.getCgpi());
		}
	%>
	<br><br>
	<a href="http://localhost:8080/students-app/add.jsp">Add Students</a>
</body>
</html>