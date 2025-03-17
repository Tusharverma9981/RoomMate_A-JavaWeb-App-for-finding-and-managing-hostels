<%-- 
    Document   : ownlisting
    Created on : 14 Mar, 2025, 9:16:56 PM
    Author     : tv464
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="db.Dbconnecter"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Room-Mate</title>
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css" integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <Style>
    
        footer {
          display: flex; 
          flex-wrap: wrap ;
          justify-content: space-evenly !important;
        }
        footer .col {
          display: flex;
          flex-direction: column;
          align-items: flex-start;
          margin-bottom: 20px;
        } 
        
        footer p {
          font-size: 13px;
          margin: 0 0 8px 0 ;
        
        }
        
        footer  a {
          font-size: 13px;
          text-decoration: none;
          color: #222;
          margin-bottom: 10px;
        }
        
        footer .follow{
          margin-top: 20px;
        }
        
        footer .follow i {
          color: #465b53;
          padding-right: 4px;
          cursor: pointer;
        }
        
        footer .install .row img {
          border:1px solid #088178;
          border-radius: 6px;
        }
        
        footer .install img {
          margin: 10px 0 15px 0;
        }
         footer .follow i:hover,
         footer a:hover{
          color: #088178;
         }
        
         footer .copyright{
          width: 100%;
          text-align: center;
         }
           </Style>
</head>
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
                <a class="nav-link active" aria-current="page" href="newListing.jsp">Create Listings</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="proflie.jsp">Proflie</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="rules.html">Rules & regulation</a>
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
    <div div class="row mt-3 p-3" >
        <div class="col-8 offset-3" >
    <h3>your Listing details</h3>
    </div>
    <%
           

            String title = request.getParameter("title");
           
            try {
               
              
              Statement  stmt = Dbconnecter.getStatement();
                String query = "SELECT * FROM listingtable WHERE title='"+title+"'";
              ResultSet  rs = stmt.executeQuery(query);
                while (rs.next()) {
                    
        %>
    
    <div div class="row mt-3 p-3" >
        <div class="col-8 offset-3" >
    <h3>Listing details</h3>
    </div>
    <div class="card col-6 offset-3 show-card" > 
        <img src="<%= rs.getString(7) %>" class="card-img-top show-img" height="500px">
    <div class="card-body">
        <p class="card-text">
            <b> <%= rs.getString(1) %> </b><br/>
            
            <%= rs.getString(2) %> <br/>
          <b>per Month:</b>  &#8377; <%= rs.getString(3) %> <br/>
          <b>Located at:</b>  <%= rs.getString(4) %> <br/>
          <b>In City:</b><%= rs.getString(5) %> <br/>
          <b>Owned By:</b><%= rs.getString(6) %> <br/>

        </p>
        </div>
           <%
                }
            } catch (Exception e) {
                e.printStackTrace();
            }    %>
          
          
        </div>
    </div>
        
            
        
    </div>
    <div class="btns">
      
        <a href="updatelisting.jsp?title=<%=title %>">
            <button class="btn btn-outline-dark col-1 offset-3 edit-btn mt-2 " type="submit">Edit</button>
         </a>
        <form method="POST" action="deleteListing">
            <input  type="hidden" value="<%=title %>" name="title"> 
            <button class="btn btn-outline-dark col-1 offset-3 edit-btn mt-3">Delete</button>
        </form>
       
        </div>
           
    
         
   
        </div>
    
    
    
    
    
    
    
    
    
    
    
    
    <br><hr>
    
    
        <footer class="section-p1 ">
            <div class="col p-1">
                <h4>Room-Mate</h4>
                <h4>Contact</h4>
                <p><strong>Address :</strong> 562 Wellinton Road ,strret 32, San Francisco</p>
                <p><strong>Phone:</strong>+91 9981939820</p>
                <p><strong>Hours:</strong>10:00 - 10:00 ,Mon - Fri</p>
            </div>
    
            <div class="col">
                <h4>About</h4>
                <a href="#">About Us</a>
                <a href="#">Auhtorization information</a>
                <a href="#">Privacy Policy</a>
                <a href="#">Terms & Condition</a>
                <a href="#">Contact Us</a>          
            </div>
    
            <div class="col">
                <h4>My Accout</h4>
                <a href="#">Sign In</a>
                <a href="#">View Favrites</a>
                <a href="#">My History</a>
                <a href="#">Help</a>
            </div>
            <div class="col">
                <h4>follow us</h4>
                <div class="icon">
                    <i class="fab fa-facebook-f"></i>
                    <span>:Facebook</span>
                    <br>
                    <i class="fab fa-twitter"></i> <span>:Twittrs</span>
                    <br>
                    <i class="fab fa-instagram"></i> <span>:Instagram</span>
                    <br>
                    <i class="fab fa-youtube"></i> <span>:Youtube</span>
                </div>
            </div>
    
            
    
            <div class="copyright">
                <p><b> &copy; 2024, Tushar Verma </b></p>
            </div>
        </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>
