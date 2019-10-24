<!DOCTYPE html>
<html>
    <head>
        <title>
            Authentic
        </title>
    </head>
    <body>
        <% String userName=request.getParameter("username"); 
        String passwords=request.getParameter("password");
        
        String admin="admin";
        if(userName.equals(admin) && passwords.equals(admin))
            out.println("Authentication Successful"+"<br> Hello "+userName);
        else{
            out.println("Authentication Failed <br>");
            out.println("<a href='login.html'>Login again</a>");
         }%>
    </body>
</html>