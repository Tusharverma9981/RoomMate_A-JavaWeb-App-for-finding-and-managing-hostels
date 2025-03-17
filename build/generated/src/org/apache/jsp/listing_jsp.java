package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import db.Dbconnecter;
import java.sql.Statement;

public final class listing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/starability-fade.min.css\"/>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css\" integrity=\"sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("     <nav class=\"navbar navbar-expand-lg bg-body-tertiary py-3 sticky-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <a class=\"navbar-brand\" href=\"home.jsp\">Room-mate</a>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link active\" aria-current=\"page\" href=\"#simple-list-item-1\"><i class=\"fa-solid fa-magnifying-glass\"></i></a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"proflie.jsp\">Proflie</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"about.html\">About</a>\n");
      out.write("              </li>\n");
      out.write("               <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"logout.jsp\">Log-out</a>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("            </ul>\n");
      out.write("            <form class=\"d-flex\" role=\"search\">\n");
      out.write("              <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("              <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("             \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("      <hr>\n");
      out.write("    \n");
      out.write("    ");

           
            String username =(String)session.getAttribute("username");
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
      out.write("        <img src=\"");
      out.print( rs.getString(7) );
      out.write("\" alt=\"image\" class=\"card-img-top show-img\" height=\"500px\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("        <p class=\"card-text\">\n");
      out.write("            <b> ");
      out.print( rs.getString(1) );
      out.write(" </b><br/>\n");
      out.write("            \n");
      out.write("            ");
      out.print( rs.getString(2) );
      out.write(" <br/>\n");
      out.write("            <b>per Month:</b> &#8377; ");
      out.print( rs.getString(3) );
      out.write(" <br/>\n");
      out.write("          <b>Located at:</b> ");
      out.print( rs.getString(4) );
      out.write(" <br/>\n");
      out.write("         <b>In City:</b>  ");
      out.print( rs.getString(5) );
      out.write(" <br/>\n");
      out.write("           <b>Owned By:</b> ");
      out.print( rs.getString(6) );
      out.write(" <br/>\n");
      out.write("\n");
      out.write("        </p>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("               ");

                }
            } catch (Exception e) {
                e.printStackTrace();
            }    
      out.write("\n");
      out.write("        \n");
      out.write("    <div class=\"btns\">\n");
      out.write("\n");
      out.write("        <form method=\"POST\" action=\"uploadReview\">\n");
      out.write("            <button class=\"btn btn-outline-dark col-1 offset-3 edit-btn mt-3\">Rent it</button>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        <div class=\"col-8 offset-3 mb-3\">\n");
      out.write("            <hr>\n");
      out.write("            <h4>Leave a Review</h4>\n");
      out.write("            <form action=\"\" method=\"POST\"  class=\"needs-validation\">\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                <div class=\"mb-3 mt-3\"> \n");
      out.write("                    <input type=\"hidden\" value=\"");
      out.print( username );
      out.write("\" name=\"username\">\n");
      out.write("                       <input type=\"hidden\" value=\"");
      out.print( title );
      out.write("\" name=\"title\">\n");
      out.write("                    <label for=\"comment\" class=\"form-label\">Comments</label>\n");
      out.write("                   \n");
      out.write("                    <textarea name=\"comment\" id=\"comment\" cols=\"30\" rows=\"5\"\n");
      out.write("                    class=\"form-control\" required></textarea>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"btn btn-outline-dark\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("    \n");
      out.write("            <hr>\n");
      out.write("            <p>All Reviews</p>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
  
                   
                try {
               
              
              Statement  stmt = Dbconnecter.getStatement();
                String query = "SELECT * FROM reviewtable WHERE title='"+title+"'";
              ResultSet  rs = stmt.executeQuery(query);

                while (rs.next()) {
                
      out.write("\n");
      out.write("    \n");
      out.write("                        <div class=\"card col-5 ms-3 mb-3  border\">\n");
      out.write("                            <div class=\"card-body mt-3\">\n");
      out.write("                                <h5> ");
      out.print( rs.getString(2) );
      out.write("</h5>\n");
      out.write("                                <p class=\"card-text\"> ");
      out.print( rs.getString(2) );
      out.write("\n");
      out.write("                                </p>\n");
      out.write("                            \n");
      out.write("                                \n");
      out.write("                                <p class=\"starability-result\" data-rating=\"\">\n");
      out.write("                                  \n");
      out.write("                                </p>\n");
      out.write("                                <form class=\"mb-3\" method=\"POST\" action=\"\">\n");
      out.write("                                    <button class=\"btn btn-sm btn-dark\">Delete</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                   ");

                }
            } catch (Exception e) {
                e.printStackTrace();
            }    
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-8 offset-3 mb-3\">\n");
      out.write("          <h3>Whare you will be</h3>\n");
      out.write("            <iframe width=\"500\" height=\"300\" src=\"https://api.maptiler.com/maps/streets-v2/?key=8rzrDlUZspwj1OE6Ogam#0.5/11.40195/-21.63924\"></iframe>\n");
      out.write("        </div>\n");
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
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
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
