<%-- 
    Document   : manageOwners
    Created on : 15 Mar, 2025, 8:34:42 PM
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
                <th>Full Name</th>
                <th>Username</th>
                <th>Password</th>
                <th>Email</th>
                <th>City</th>
                <th>Action</th>
            </tr>
            <% 
                
              
                ResultSet rs = null;
                try {
                    
                    
                   Statement  stmt = Dbconnecter.getStatement();
                    rs = stmt.executeQuery("SELECT * FROM ownertable");
                    while (rs.next()) {
            %>
            <tr>
                <td><%= rs.getString("owner") %></td>
                <td><%= rs.getString("username") %></td>
                <td><%= rs.getString("password") %></td>
                <td><%= rs.getString("email") %></td>
                <td><%= rs.getString("city") %></td>
                <td><form method="POST" action="deleteAdmin">
                        <input type="hidden" name="type" value="owner">
                        <input type="hidden" name="username" value="<%= rs.getString("username") %>">
                        <button>Delete Owner</button> </form></td>
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


