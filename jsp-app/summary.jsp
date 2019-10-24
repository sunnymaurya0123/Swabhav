<!DOCTYPE html>
<html>

<head>
    <title>
        Summary
    </title>
</head>

<body>
    <form style="padding-left: 500px; background-color: green;" method="POST" action="summary.jsp">
        <br><label style="color: yellow;">Latest Session Counter: <%out.println(session.getAttribute("counter"));%></label><br><br>
        <label style="color: yellow;">Latest Application Counter: <%out.println(application.getAttribute("counter"));%></label><br><br>
    </form>

</body>

</html>