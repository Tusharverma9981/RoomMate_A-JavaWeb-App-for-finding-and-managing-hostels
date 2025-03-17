<%-- 
    Document   : home
    Created on : 11 Mar, 2025, 2:38:39 PM
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
 .cardh {
        transition: transform 0.3s ease, box-shadow 0.3s ease;
        border-radius: 10px;
    }

    .cardh:hover {
        transform: scale(1.05) translateY(-5px); /* Pops out and moves slightly up */
        box-shadow: 0 15px 30px rgba(0, 0, 0, 0.2); /* Deeper shadow for floating effect */
   </Style>
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
              <form class="d-flex" role="search" method="POST" action="searchAction">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="item">
              <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
             
          </div>
        </div>
      </nav>
      <hr>
      
      <div id="carouselExampleAutoplaying" class="carousel slide p-4" data-bs-ride="carousel">
        <div class="carousel-indicators">
          <button type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
          <button type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide-to="1" aria-label="Slide 2"></button>
          <button type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img src="https://media.istockphoto.com/id/1464143895/photo/hostel-dormitory-beds-at-cheap-room.jpg?s=2048x2048&w=is&k=20&c=KTe6Gxh9fE06uw4BFtrjsRdaWtToBXsjGJcTpXnJruA=" class="d-block w-100" alt="img" height="650px">
            <div class="carousel-caption d-none d-md-block">
              <h5><b>Find Your Perfect Stay</b></h5>
              <p>Explore a wide range of verified hostels, PGs, and rental properties designed for students and young professionals. Comfort and convenience just a click away!</p>
            </div>
          </div>
          <div class="carousel-item">
            <img src="https://thumbs.dreamstime.com/b/bunk-beds-hostel-room-54783568.jpg" class="d-block w-100" alt="img" height="650px">
            <div class="carousel-caption d-none d-md-block">
              <h5><b> List Your Property with Ease</b></h5>
              <p>Have a space to rent out? Connect with potential tenants quickly and effortlessly on Room-Mate. Start listing today!</p>
            </div>
          </div>
          <div class="carousel-item">
            <img src="https://thumbs.dreamstime.com/b/backpackers-hostel-modern-bunk-beds-dorm-room-twelve-people-inside-79935795.jpg" class="d-block w-100" alt="img" height="650px">
            <div class="carousel-caption d-none d-md-block">
              <h5> <b> Your Next Home Awaits</b></h5>
              <p>Discover fully-furnished, budget-friendly, and secure accommodations tailored to your needs. Begin your journey with Room-Mate!</p>
            </div>
          </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>
      <hr>


      <h2 class="text-center" id="simple-list-item-1">Find you next Home</h2>
      <div class="container text-center">
        <div div class="row">
            
            <%
           

            

            try {
               
              
              Statement  stmt = Dbconnecter.getStatement();
                String query = "SELECT * FROM listingtable";
              ResultSet  rs = stmt.executeQuery(query);

                while (rs.next()) {
        %>
            
            <div class="col pt-3">
            <div class="card cardh" style="width: 20rem;">
                <img src="<%= rs.getString(7) %>" class="card-img-top" alt="img">
                <div class="card-body">
                    <h5 class="card-title"><%= rs.getString(1) %></h5>
                </div>
                <ul class="list-group list-group-flush">
                  <li class="list-group-item">&#8377;<%= rs.getString(3) %><b>/Month</b></li>  
                </ul>
                <div class="card-body">
                    <a href="listing.jsp?title=<%= rs.getString(1) %>"><button type="button" class="btn btn-light">Rent It</button></a>
                </div>
              </div>
            </div>
                
                 <%
                }
            } catch (Exception e) {
                e.printStackTrace();
            }    %>
        </div>
      </div>

      <div class="card text-center m-4">
        <div class="card-header">
          Featured
        </div>
        <div class="card-body">
          <h5 class="card-title">Special Offers</h5>
          <p class="card-text">This is the discription of the offers given above </p>
          <a href="#" class="btn btn-primary">get it</a>
        </div>
        <div class="card-footer text-body-secondary">
          2 days ago
        </div>
      </div>
     



              





      <hr>
      <footer >
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
