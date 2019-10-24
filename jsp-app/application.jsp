<!DOCTYPE html>
<html>

<head>
    <title>
        Application
    </title>
</head>

<body>
    <% int count;
            if(application.getAttribute("counter")==null)
                count=0;
            else
                count=(Integer)application.getAttribute("counter");
             int prevCount=count;
            count=count+1;
            application.setAttribute("counter",count); %>
    <form style="padding-left: 500px; background-color: green;" method="POST" action="application.jsp">
        <br><label style="color: yellow;">Session Id: <%out.println(session.getId());%></label><br><br>
        <label style="color: yellow;">Old: <%out.println(prevCount);%></label><br><br>
        <label style="color: yellow;">New: <%out.println(count);%></label><br><br>
        <a style="color: yellow;" href="summary.jsp">Summary</a><br><br>
    </form>

</body>

</html>