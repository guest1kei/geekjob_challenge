<%-- 
    Document   : challlenge6-2
    Created on : 2018/01/24, 15:32:54
    Author     : guest1Day
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList<String> data = new ArrayList<String>();
            data.add("10");
            data.add("100");
            data.add("soeda");
            data.add("hayashi");
            data.add("-20");
            data.add("118");
            data.add("END");
            out.print("要素数" + data.size() + "<br>");
            out.print(data+"<br>");

            data.set(2, "33");
            for (String main : data) {
                out.print(main);
            }
        %>
    </body>
</html>
