<%-- 
    Document   : chalenge 4-1
    Created on : 2018/01/17, 16:28:08
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
            final String user = "groove";
            final String num = "-";
            final String name = "gear";

            out.print(user + num + name);
        %>
    </body>
</html>
