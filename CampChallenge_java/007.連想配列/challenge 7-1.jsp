<%-- 
    Document   : challenge 7-1
    Created on : 2018/01/25, 13:36:41
    Author     : guest1Day
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HashMap<String, String> data1 = new HashMap<String, String>();
            HashMap<String, String> data2 = new HashMap<String, String>();
            HashMap<String, String> data3 = new HashMap<String, String>();
            HashMap<String, String> data4 = new HashMap<String, String>();

            data1.put("1", "AAA");
            data2.put("hello", "world");
            data3.put("name", "soeda"); data3.put("age","33");
            data4.put("20", "20");

            ArrayList<HashMap> datas = new ArrayList<HashMap>();

            datas.add(data1);
            datas.add(data2);
            datas.add(data3);
            datas.add(data4);

            out.print(datas);


        %>
    </body>
</html>
