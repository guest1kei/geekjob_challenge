<%-- 
    Document   : challenge 6-1
    Created on : 2018/01/24, 13:44:35
    Author     : guest1Day
--%>

<%@page import="java.util.Arrays"%>
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
            // "10", "100", "soeda", "hayashi", "-20", "118", "END"
            ArrayList<String> data = new ArrayList<String>();

            data.add("10");
            data.add("100");
            data.add("soeda");
            data.add("hayashi");
            data.add("-20");
            data.add("118");
            data.add("END");
            out.print("要素数" + data.size() + "<br>");

            for (String main : data) {
                out.print(main);
                out.print("<br>");
            }

        %>
    </body>
</html>
