package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import db.Dbconnecter;
import java.sql.Statement;

public final class ownlisting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Room-Mate</title>\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css\" integrity=\"sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("    <Style>\n");
      out.write("    \n");
      out.write("        footer {\n");
      out.write("          display: flex; \n");
      out.write("          flex-wrap: wrap ;\n");
      out.write("          justify-content: space-evenly !important;\n");
      out.write("        }\n");
      out.write("        footer .col {\n");
      out.write("          display: flex;\n");
      out.write("          flex-direction: column;\n");
      out.write("          align-items: flex-start;\n");
      out.write("          margin-bottom: 20px;\n");
      out.write("        } \n");
      out.write("        \n");
      out.write("        footer p {\n");
      out.write("          font-size: 13px;\n");
      out.write("          margin: 0 0 8px 0 ;\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        footer  a {\n");
      out.write("          font-size: 13px;\n");
      out.write("          text-decoration: none;\n");
      out.write("          color: #222;\n");
      out.write("          margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        footer .follow{\n");
      out.write("          margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        footer .follow i {\n");
      out.write("          color: #465b53;\n");
      out.write("          padding-right: 4px;\n");
      out.write("          cursor: pointer;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        footer .install .row img {\n");
      out.write("          border:1px solid #088178;\n");
      out.write("          border-radius: 6px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        footer .install img {\n");
      out.write("          margin: 10px 0 15px 0;\n");
      out.write("        }\n");
      out.write("         footer .follow i:hover,\n");
      out.write("         footer a:hover{\n");
      out.write("          color: #088178;\n");
      out.write("         }\n");
      out.write("        \n");
      out.write("         footer .copyright{\n");
      out.write("          width: 100%;\n");
      out.write("          text-align: center;\n");
      out.write("         }\n");
      out.write("           </Style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-body-tertiary py-3 sticky-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <a class=\"navbar-brand\" href=\"home2.jsp\">Room-mate</a>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link active\" aria-current=\"page\" href=\"newListing.jsp\">Create Listings</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"proflie.jsp\">Proflie</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"rules.html\">Rules & regulation</a>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("            </ul>\n");
      out.write("            <form class=\"d-flex\" role=\"search\">\n");
      out.write("              <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("              <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("      <hr>\n");
      out.write("    <div div class=\"row mt-3 p-3\" >\n");
      out.write("        <div class=\"col-8 offset-3\" >\n");
      out.write("    <h3>your Listing details</h3>\n");
      out.write("    </div>\n");
      out.write("    ");

           

            String title = request.getParameter("title");
           
            try {
               
              
              Statement  stmt = Dbconnecter.getStatement();
                String query = "SELECT * FROM listingtable WHERE title='"+title+"'";
              ResultSet  rs = stmt.executeQuery(query);
                while (rs.next()) {
                    
        
      out.write("\n");
      out.write("    \n");
      out.write("    <div div class=\"row mt-3 p-3\" >\n");
      out.write("        <div class=\"col-8 offset-3\" >\n");
      out.write("    <h3>Listing details</h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card col-6 offset-3 show-card\" > \n");
      out.write("        <img src=\"https://media.istockphoto.com/id/1464143895/photo/hostel-dormitory-beds-at-cheap-room.jpg?s=2048x2048&w=is&k=20&c=KTe6Gxh9fE06uw4BFtrjsRdaWtToBXsjGJcTpXnJruA=\" alt=\"image\" class=\"card-img-top show-img\" height=\"500px\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("        <p class=\"card-text\">\n");
      out.write("            <b> ");
      out.print( rs.getString(1) );
      out.write(" </b><br/>\n");
      out.write("            \n");
      out.write("            ");
      out.print( rs.getString(2) );
      out.write(" <br/>\n");
      out.write("            &#8377; ");
      out.print( rs.getString(3) );
      out.write(" <br/>\n");
      out.write("           ");
      out.print( rs.getString(4) );
      out.write(" <br/>\n");
      out.write("          ");
      out.print( rs.getString(5) );
      out.write(" <br/>\n");
      out.write("          Owned by ");
      out.print( rs.getString(6) );
      out.write(" <br/>\n");
      out.write("\n");
      out.write("        </p>\n");
      out.write("        </div>\n");
      out.write("           ");

                }
            } catch (Exception e) {
                e.printStackTrace();
            }    
      out.write("\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"btns\">\n");
      out.write("        ");
 
        System.out.print(title);
        
      out.write("\n");
      out.write("        <form method=\"get\" action=\"updatelisting.jsp?title=");
      out.print(title );
      out.write("\">\n");
      out.write("            <button class=\"btn btn-outline-dark col-1 offset-3 edit-btn mt-2 \" type=\"submit\">Edit</button>\n");
      out.write("         </form>\n");
      out.write("        <form method=\"POST\" action=\"\">\n");
      out.write("            <button class=\"btn btn-outline-dark col-1 offset-3 edit-btn mt-3\">Delete</button>\n");
      out.write("        </form>\n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("    \n");
      out.write("         \n");
      out.write("   \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <br><hr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <footer class=\"section-p1 \">\n");
      out.write("            <div class=\"col p-1\">\n");
      out.write("                <h4>Room-Mate</h4>\n");
      out.write("                <h4>Contact</h4>\n");
      out.write("                <p><strong>Address :</strong> 562 Wellinton Road ,strret 32, San Francisco</p>\n");
      out.write("                <p><strong>Phone:</strong>+91 9981939820</p>\n");
      out.write("                <p><strong>Hours:</strong>10:00 - 10:00 ,Mon - Fri</p>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <div class=\"col\">\n");
      out.write("                <h4>About</h4>\n");
      out.write("                <a href=\"#\">About Us</a>\n");
      out.write("                <a href=\"#\">Auhtorization information</a>\n");
      out.write("                <a href=\"#\">Privacy Policy</a>\n");
      out.write("                <a href=\"#\">Terms & Condition</a>\n");
      out.write("                <a href=\"#\">Contact Us</a>          \n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <div class=\"col\">\n");
      out.write("                <h4>My Accout</h4>\n");
      out.write("                <a href=\"#\">Sign In</a>\n");
      out.write("                <a href=\"#\">View Favrites</a>\n");
      out.write("                <a href=\"#\">My History</a>\n");
      out.write("                <a href=\"#\">Help</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <h4>follow us</h4>\n");
      out.write("                <div class=\"icon\">\n");
      out.write("                    <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                    <span>:Facebook</span>\n");
      out.write("                    <br>\n");
      out.write("                    <i class=\"fab fa-twitter\"></i> <span>:Twittrs</span>\n");
      out.write("                    <br>\n");
      out.write("                    <i class=\"fab fa-instagram\"></i> <span>:Instagram</span>\n");
      out.write("                    <br>\n");
      out.write("                    <i class=\"fab fa-youtube\"></i> <span>:Youtube</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            \n");
      out.write("    \n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <p><b> &copy; 2024, Tushar Verma </b></p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
