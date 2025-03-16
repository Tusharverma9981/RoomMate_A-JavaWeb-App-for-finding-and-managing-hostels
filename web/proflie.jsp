<%-- 
    Document   : proflie
    Created on : 13 Mar, 2025, 11:07:21 PM
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
        <style>
  .user-profile {
    width: 300px;
    margin: 20px auto;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 12px;
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
    background-color: #f9f9f9;
  }
  .user-profile h2 {
    text-align: center;
    margin-bottom: 15px;
    color: #333;
  }
  .user-profile ul {
    list-style: none;
    padding: 0;
  }
  .user-profile li {
    margin-bottom: 10px;
  }
  .user-profile strong {
    color: #555;
  }
</style>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  
    </head>
    <body>
         <% 
        String username =(String)session.getAttribute("username");
        String usertype =(String)session.getAttribute("usertype");
        String home= "";
         Statement st = Dbconnecter.getStatement();
         String query="";
         if("owner".equals(usertype)){
          query = "SELECT  * FROM ownertable WHERE username='"+username+"'";
          home="home2.jsp";
         }
         else{
              query = "SELECT  * FROM usertable WHERE username='"+username+"'";
               home="home.jsp";
         }
        
          ResultSet rs=st.executeQuery(query);
          
          String Fullname ="";
          String email ="";
          String city ="";
          
          
           if(rs.next()){
               
                  Fullname = rs.getString(1);
                  city = rs.getString(5);
                   email = rs.getString(3);
                    
            }
           
//          
//               
        %>
        
         <nav class="navbar navbar-expand-lg bg-body-tertiary py-3 sticky-top">
        <div class="container-fluid">
            <a class="navbar-brand" href="<%=home%>">Room-mate</a>
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
                <a class="nav-link" href="about.html"></a>
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
        
       
   
       <div class="user-profile">
  <h2>User Profile</h2>
  <ul>
        <li><strong>Full Name:</strong> <span id="user-Fullname" ><%=Fullname %></span></li>
       <li><strong>Username</strong> <span id="username"><%= username %></span></li>
  
        
      
    <li><strong>Email:</strong> <span id="email"><%= email %></span></li>
    <li><strong>City:</strong> <span id="city"><%= city %></span></li>
  </ul>
  <form method="GET" action="Updateproflie">
              <button id="profile-button">
              Update Proflie
          </button>
      </form>
       <br>
  <form method="POST" action="DeleteProfile" >
      <button id="profile-button" onclick="alert='do you want to delete the user' ">
              Delete Proflie
          </button>
      </form>
       <br>
       
</div>
  
  <script>
      alertmessage = ()=>{
          alert("are you sure you want to delete the user");
      }
  </script>
  
    </body>
</html>
