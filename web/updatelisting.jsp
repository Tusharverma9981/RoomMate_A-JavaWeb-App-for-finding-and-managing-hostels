<%-- 
    Document   : updatelisting
    Created on : 14 Mar, 2025, 10:47:39 PM
    Author     : tv464
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="db.Dbconnecter"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
    <title>Update Page</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css" integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
   
</head>
<%     
        String owner  =(String)session.getAttribute("username");
        
            String title = request.getParameter("title");
            System.out.print(title);
           
            try {
               
              
              Statement  stmt = Dbconnecter.getStatement();
                String query = "SELECT * FROM listingtable WHERE title='"+title+"'";
              ResultSet  rs = stmt.executeQuery(query);
                while (rs.next()) {
                    
        %>

          
        
        


<body>
     <nav class="navbar navbar-expand-lg bg-body-tertiary py-3 sticky-top">
        <div class="container-fluid">
            <a class="navbar-brand" href="home2.jsp">Room-mate</a>
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
    <div class="row">
        <div class="col-8 offset-2">
            <br>
        <h3>Update Your Listing</h3>
    <form  method="POST" action="updatelisting"  class="needs-validation" >
        <div class="mb-3">
        <label for="title" class="form-label">Title</label>
        <input name="title" placeholder="enter title" type="text" class="form-control" required value="<%= rs.getString(1) %>" readonly="">
        </div>
        <div class="mb-3">
            <label for="description" class="form-label">Enter description</label>
        <textarea name="description" placeholder="enter description" class="form-control" required ><%= rs.getString(2)%></textarea>
        </div>
        
         <div class="mb-3">
            <img src="<%= rs.getString(7) %>" alt="originalImage" height="200px">
        </div>
      
        <div class="mb-3">
            <label for="image" class="form-label">Upload new Image link</label>
        <input name="image" placeholder="enter image link" class="form-control" type="text" >
        </div>
        <div class="mb-3">
            <label for="price" class="form-label">Price</label>
        <input name="price" placeholder="enter price" type="number"  class="form-control" required value="<%= rs.getString(3) %>">
        </div>
        <div class="row">
        <div class="mb-3 col-md-4">
            <label for="city" class="form-label">City</label>    
        <input name="city" placeholder="enter city" type="text" class="form-control" required value="<%= rs.getString(4) %>">
        </div>
        <div class="mb-3 col-md-8">
        <label for="location" class="form-label">Location</label>
        <input name="location" placeholder="enter location" type="text" class="form-control" required value="<%= rs.getString(5) %>">
        </div>
        <div class="mb-3 col-md-8">
            <label for="owner" class="form-label">Owner</label>
            <input name="owner" value="<%= owner %>" type="text" class="form-control" readonly>
            </div>
        </div>
        <br>
        <button class="btn btn-outline-dark">Edit</button>
    </form>
    <br>
</div>
</div>
   <%
                }
            } catch (Exception e) {
                e.printStackTrace();
            }    %>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>


</html>
