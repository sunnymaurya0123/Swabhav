<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>This is Home Jsp Page</h1>
<s:iterator begin="0" end="9">Developer: <s:property value="developer" /><br></s:iterator>

      
</body>
</html>