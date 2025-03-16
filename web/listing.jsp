<%-- 
    Document   : listing
    Created on : 14 Mar, 2025, 2:11:40 PM
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
    
  <link rel="stylesheet" type="text/css" href="css/starability-fade.min.css"/>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css" integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
   
</head>
<body>
     <nav class="navbar navbar-expand-lg bg-body-tertiary py-3 sticky-top">
        <div class="container-fluid">
          <a class="navbar-brand" href="home.jsp">Room-mate</a>
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
        <img src="https://media.istockphoto.com/id/1464143895/photo/hostel-dormitory-beds-at-cheap-room.jpg?s=2048x2048&w=is&k=20&c=KTe6Gxh9fE06uw4BFtrjsRdaWtToBXsjGJcTpXnJruA=" alt="image" class="card-img-top show-img" height="500px">
    <div class="card-body">
        <p class="card-text">
            <b> <%= rs.getString(1) %> </b><br/>
            
            <%= rs.getString(2) %> <br/>
            &#8377; <%= rs.getString(3) %> <br/>
           <%= rs.getString(4) %> <br/>
          <%= rs.getString(5) %> <br/>
          Owned by <%= rs.getString(6) %> <br/>

        </p>
        </div>
        </div>
    </div>
        
               <%
                }
            } catch (Exception e) {
                e.printStackTrace();
            }    %>
        
    <div class="btns">

        <form method="POST" action="">
            <button class="btn btn-outline-dark col-1 offset-3 edit-btn mt-3">Rent it</button>
        </form>
        </div>
    
        <div class="col-8 offset-3 mb-3">
            <hr>
            <h4>Leave a Review</h4>
            <form action="" method="POST" novalidate class="needs-validation">
               
                <div class="mb-3 mt-3">
                    <label for="rating" class="form-label">Rating</label>
                <fieldset class="starability-slot">
                   
                    
                    <input type="radio" id="no-rate" class="input-no-rate" name="review[rating]" value="1" checked aria-label="No rating." />
                    <input type="radio" id="first-rate1" name="review[rating]" value="1" />
                    <label for="first-rate1" title="Terrible">1 star</label>
                    <input type="radio" id="first-rate2" name="review[rating]" value="2" />
                    <label for="first-rate2" title="Not good">2 stars</label>
                    <input type="radio" id="first-rate3" name="review[rating]" value="3" />
                    <label for="first-rate3" title="Average">3 stars</label>
                    <input type="radio" id="first-rate4" name="review[rating]" value="4" />
                    <label for="first-rate4" title="Very good">4 stars</label>
                    <input type="radio" id="first-rate5" name="review[rating]" value="5" />
                    <label for="first-rate5" title="Amazing">5 stars</label>
                  </fieldset>
                </div>
                <div class="mb-3 mt-3">
                    <label for="comment" class="form-label">Comments</label>
                    <textarea name="review[comment]" id="comment" cols="30" rows="5"
                    class="form-control" required></textarea>
                </div>
                <button class="btn btn-outline-dark">Submit</button>
            </form>
    
            <hr>
            <p>All Reviews</p>
            <div class="row">
                
    
                        <div class="card col-5 ms-3 mb-3  border">
                            <div class="card-body mt-3">
                                <h5>Jone Doe</h5>
                                <p class="card-text">Good place to stay
                                </p>
                            
                                
                                <p class="starability-result" data-rating="">
                                  
                                </p>
                                <form class="mb-3" method="POST" action="">
                                    <button class="btn btn-sm btn-dark">Delete</button>
                                </form>
                            </div>
                        </div>
                
            </div>
        </div>
        <div class="col-8 offset-3 mb-3">
          <h3>Whare you will be</h3>
            <iframe width="500" height="300" src="https://api.maptiler.com/maps/streets-v2/?key=8rzrDlUZspwj1OE6Ogam#0.5/11.40195/-21.63924"></iframe>
        </div>
        </div>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>
