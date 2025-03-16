<%-- 
    Document   : logout
    Created on : 13 Mar, 2025, 11:59:30 PM
    Author     : tv464
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
            session.invalidate();
            response.sendRedirect("index.html");
            %>
            
    </body>
</html>
