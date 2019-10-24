<!DOCTYPE html>
<html>

<head>
    <title>
        Set Cookies
    </title>
</head>

<body>
    <% Cookie colorCookie = new Cookie("color","red");
              colorCookie.setMaxAge(60*60*24*7);
              response.addCookie(colorCookie); %>
    <form method="POST" action="setcookies.jsp">
        <p>Cookies Created Successfully</p>
        <a href="getcookies.jsp">View Cookies</a>
    </form>
</body>

</html>