<%-- 
    Document   : UpdateProflie
    Created on : 13 Mar, 2025, 11:15:25 PM
    Author     : tv464
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="db.Dbconnecter"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  
    </head>
    <style>
  .update-profile {
    width: 300px;
    margin: 20px auto;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 12px;
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
    background-color: #f9f9f9;
  }
  .update-profile h3 {
    text-align: center;
    margin-bottom: 15px;
    color: #333;
  }
  .update-profile label {
    display: block;
    margin-bottom: 5px;
    color: #555;
  }
  .update-profile input {
    width: 100%;
    padding: 8px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 8px;
  }
  .update-profile button {
    width: 100%;
    padding: 10px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 8px;
    cursor: pointer;
    font-size: 16px;
  }
  .update-profile button:hover {
    background-color: #45a049;
  }
</style>

 
        <% 
        String username =(String)session.getAttribute("username");
         String usertype =(String)session.getAttribute("usertype");
         Statement st = Dbconnecter.getStatement();
         String query="";
         if("owner".equals(usertype)){
          query = "SELECT  * FROM ownertable WHERE username='"+username+"'";
         }
         else{
              query = "SELECT  * FROM usertable WHERE username='"+username+"'";
         }
        
          ResultSet rs=st.executeQuery(query);
          
          String Fullname ="";
          String email ="";
          String city ="";
          String password = "";
          
          
           if(rs.next()){
               
                  Fullname = rs.getString(1);
                  password = rs.getString(4);
                  email = rs.getString(3);
                   city = rs.getString(5);
                    
                    
            }
           
//          
//               
        
%>

    <body>
         <nav class="navbar navbar-expand-lg bg-body-tertiary py-3 sticky-top">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">Room-mate</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#simple-list-item-1"><i class="fa-solid fa-magnifying-glass"></i></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="proflie.jsp">Proflie</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="about.html">About</a>
              </li>
               <li class="nav-item">
                <a class="nav-link" href="logout.jsp">Log-out</a>
              </li>
              
            </ul>
            <form class="d-flex" role="search">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
             
          </div>
        </div>
      </nav>
      <hr>
        
        <form class="update-profile" method="POST" action="Updateproflie">
  <h3>Update Profile</h3>
  <label for="username">Username:</label>
  <input type="text" id="username" name="username" value="<%= username %>" placeholder="Enter new username" readonly>

  <label for="user-id">Full Name</label>
  <input type="text" id="user-Fullname" name="Fullname" value="<%= Fullname %>" placeholder="Enter new Full name" required>

  <label for="salary">Email</label>
  <input type="text" id="email" name="email" value="<%= email %>" placeholder="Enter new email" >

  <label for="city">City:</label>
  <input type="text" id="city" name="city" value="<%= city %>" placeholder="Enter new city" >

   <label for="passwordOld">Old Password:</label>
   <input type="text" id="password" name="Oldpassword" value="<%= password %>">
  
  <label for="password">Password:</label>
  <input type="password" id="password" name="password" placeholder="Enter new password" value="<%= password %>">

  <button type="submit">Update</button>
</form>
        
    </body>
</html>

