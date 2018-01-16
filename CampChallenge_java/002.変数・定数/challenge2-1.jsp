<%-- 
    Document   : challenge2-1
    Created on : 2018/01/16, 17:31:40
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
            int age = 100;
            String name = "ウワボです！";

            out.print("こんにちは<br>");

            float point = 0.21F;
            float ap = age * point;

            out.print(name);
           
//            ap += "歳です";
//          ap = ap + "歳です";
            String introduction = ap + "歳です";
            out.print(introduction);
            



        %>
    </body>
</html>
