<%-- 
    Document   : manageListings
    Created on : 15 Mar, 2025, 8:37:50 PM
    Author     : tv464
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
        <h2>Manage Users</h2>
        <table>
            <tr>
                <th>Title</th>
                <th>Description</th>
                <th>Price</th>
                <th>Location</th>
                <th>City</th>
                 <th>Owner</th>
                <th>Action</th>
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
                <td><form method="POST" action="deleteAdmin">
                        <input type="hidden" name="type" value="listing">
                        <input type="hidden" name="title" value="<%= rs.getString("title") %>">
                        <button>Delete listing</button> </form></td>
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


