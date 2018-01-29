<%-- 
    Document   : challenge 8-2
    Created on : 2018/01/29, 13:11:00
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
            String moji = "A";
             for(int i=1;i<30;i++)
            {
             
                moji=moji+"A";   

            }
              out.print(moji);
        %>
    </body>
</html>
