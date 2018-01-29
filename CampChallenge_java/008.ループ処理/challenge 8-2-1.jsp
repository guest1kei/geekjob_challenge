<%-- 
    Document   : challenge 8-2-1
    Created on : 2018/01/29, 15:11:02
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
            int A = 1000;
           // int total=1;
            while (A >100) {
                A=A/2;
            
            }
            out.print(A);
        %>
    </body>
</html>
