<%-- 
    Document   : FortuneTellingResult
    Created on : 2018/01/30, 16:48:12
    Author     : guest1Day
--%>

<%@page import="org.camp.ResultData"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            ResultData data = (ResultData)request.getAttribute("DATA");
 %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        if(data!=null){
        out.print("<h1>あなたの"+data.getD()+"の運勢は、"+data.getLuckList()+"です！</h1>");
        
        }
        %>
    </body>
</html>
