<%-- 
    Document   : infoListing
    Created on : 18 Mar, 2025, 10:39:16 PM
    Author     : tv464
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%@page import="db.Dbconnecter"%>


<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Users</title>
    <style>
        body {
            background-color: #121212;
            color: #ffffff;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .container {
            padding: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #1e1e1e;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ffffff;
            text-align: left;
        }
        th {
            background-color: #333;
        }
        a {
            color: #00bcd4;
            text-decoration: none;
        }
        .home-button {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #00bcd4;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }
        .home-button:hover {
            background-color: #008c9e;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Information of all the Listing</h2>
        <table>
            <tr>
                <th>Title</th>
                <th>Description</th>
                <th>Price</th>
                <th>Location</th>
                <th>City</th>
                 <th>Owner</th>
                 
                <th>Image</th>
               
            </tr>
            <% 
                
              
                ResultSet rs = null;
                try {
                    
                    
                   Statement  stmt = Dbconnecter.getStatement();
                    rs = stmt.executeQuery("SELECT * FROM listingtable");
                    while (rs.next()) {
            %>
            <tr>
                <td><%= rs.getString("title") %></td>
                <td><%= rs.getString("description") %></td>
                <td><%= rs.getString("price") %></td>
                <td><%= rs.getString("location") %></td>
                <td><%= rs.getString("city") %></td>
                <td><%= rs.getString("owner") %></td>
               
                <td><a href="<%= rs.getString("image")%>">Image Link</a></td>
                     
            </tr>
            <%
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
        </table>
         <a href="adminHome.html" class="home-button">Go to Dashboard</a>
    </div>
</body>
</html>



