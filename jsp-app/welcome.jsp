<!DOCTYPE html>
<html>
    <head>
        <title>
            Welcome Page
        </title>
    </head>
    <body style="background-color: khaki">
        <h1><% out.print("Welcome to JSP"); %></h1>
        
        <% String name=request.getParameter("developer");
            
            if(name!="") 
                for(int i=0;i<5;i++)
                    out.println(name+"<br>");
            else
                for(int i=0;i<5;i++)
                    out.println("Welcome to JSP<br>");%>
    </body>
</html>