package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import db.Dbconnecter;
import java.sql.Statement;

public final class proflie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("  .user-profile {\n");
      out.write("    width: 300px;\n");
      out.write("    margin: 20px auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 12px;\n");
      out.write("    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("  }\n");
      out.write("  .user-profile h2 {\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("    color: #333;\n");
      out.write("  }\n");
      out.write("  .user-profile ul {\n");
      out.write("    list-style: none;\n");
      out.write("    padding: 0;\n");
      out.write("  }\n");
      out.write("  .user-profile li {\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("  }\n");
      out.write("  .user-profile strong {\n");
      out.write("    color: #555;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
 
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
        
      out.write("\n");
      out.write("        \n");
      out.write("         <nav class=\"navbar navbar-expand-lg bg-body-tertiary py-3 sticky-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"");
      out.print(home);
      out.write("\">Room-mate</a>\n");
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
      out.write("                <a class=\"nav-link\" href=\"about.html\"></a>\n");
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
      out.write("        \n");
      out.write("       \n");
      out.write("   \n");
      out.write("       <div class=\"user-profile\">\n");
      out.write("  <h2>User Profile</h2>\n");
      out.write("  <ul>\n");
      out.write("        <li><strong>Full Name:</strong> <span id=\"user-Fullname\" >");
      out.print(Fullname );
      out.write("</span></li>\n");
      out.write("       <li><strong>Username</strong> <span id=\"username\">");
      out.print( username );
      out.write("</span></li>\n");
      out.write("  \n");
      out.write("        \n");
      out.write("      \n");
      out.write("    <li><strong>Email:</strong> <span id=\"email\">");
      out.print( email );
      out.write("</span></li>\n");
      out.write("    <li><strong>City:</strong> <span id=\"city\">");
      out.print( city );
      out.write("</span></li>\n");
      out.write("  </ul>\n");
      out.write("  <form method=\"GET\" action=\"Updateproflie\">\n");
      out.write("              <button id=\"profile-button\">\n");
      out.write("              Update Proflie\n");
      out.write("          </button>\n");
      out.write("      </form>\n");
      out.write("       <br>\n");
      out.write("  <form method=\"POST\" action=\"DeleteProfile\" >\n");
      out.write("      <button id=\"profile-button\" onclick=\"alert='do you want to delete the user' \">\n");
      out.write("              Delete Proflie\n");
      out.write("          </button>\n");
      out.write("      </form>\n");
      out.write("       <br>\n");
      out.write("       \n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("  <script>\n");
      out.write("      alertmessage = ()=>{\n");
      out.write("          alert(\"are you sure you want to delete the user\");\n");
      out.write("      }\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("    </body>\n");
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
