<!DOCTYPE html>
<html>

<head>
    <title>
        Set Cookies
    </title>
</head>

<body>
            <%
            Cookie cookie = null;
            Cookie[] cookies = null;
            cookies = request.getCookies();
            String color;
            if( cookies != null ) {
               out.println("<h2> Cookies Found </h2>");
               
               for (int i = 0; i < cookies.length; i++) {
                  cookie = cookies[i];
                  if(cookie.getName().equals("color")){
                    out.print("Name : " + cookie.getName( ) + ",  ");
                    out.print("Value: " + cookie.getValue( )+" <br/>");
                    color=cookie.getValue();%>
                    <body style='background-color: <%=color %>'></body>
                    <% break;
                  }
               }
            } else {
               out.println("<h2>No cookies founds</h2>");
            }
         %>

</body>

</html>