<%-- 
    Document   : challenge 3-1
    Created on : 2018/01/17, 14:09:05
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            final int BASE = 100;
            int num = 5;

            out.print(BASE+num+"<br>");
            out.print(BASE-num+"<br>");
            out.print(BASE*num+"<br>");
            out.print(BASE/num+"<br>");
            
out.print(--num);
            
            
         

        %>
    </body>
</html>
