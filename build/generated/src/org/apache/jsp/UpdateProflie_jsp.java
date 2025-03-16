package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import db.Dbconnecter;
import java.sql.Statement;

public final class UpdateProflie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("  .update-profile {\n");
      out.write("    width: 300px;\n");
      out.write("    margin: 20px auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 12px;\n");
      out.write("    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("  }\n");
      out.write("  .update-profile h3 {\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("    color: #333;\n");
      out.write("  }\n");
      out.write("  .update-profile label {\n");
      out.write("    display: block;\n");
      out.write("    margin-bottom: 5px;\n");
      out.write("    color: #555;\n");
      out.write("  }\n");
      out.write("  .update-profile input {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 8px;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 8px;\n");
      out.write("  }\n");
      out.write("  .update-profile button {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-size: 16px;\n");
      out.write("  }\n");
      out.write("  .update-profile button:hover {\n");
      out.write("    background-color: #45a049;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write(" \n");
      out.write("        ");
 
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
        

      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"navbar navbar-expand-lg bg-body-tertiary py-3 sticky-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">Room-mate</a>\n");
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
      out.write("        \n");
      out.write("        <form class=\"update-profile\" method=\"POST\" action=\"Updateproflie\">\n");
      out.write("  <h3>Update Profile</h3>\n");
      out.write("  <label for=\"username\">Username:</label>\n");
      out.write("  <input type=\"text\" id=\"username\" name=\"username\" value=\"");
      out.print( username );
      out.write("\" placeholder=\"Enter new username\" readonly>\n");
      out.write("\n");
      out.write("  <label for=\"user-id\">Full Name</label>\n");
      out.write("  <input type=\"text\" id=\"user-Fullname\" name=\"Fullname\" value=\"");
      out.print( Fullname );
      out.write("\" placeholder=\"Enter new Full name\" required>\n");
      out.write("\n");
      out.write("  <label for=\"salary\">Email</label>\n");
      out.write("  <input type=\"text\" id=\"email\" name=\"email\" value=\"");
      out.print( email );
      out.write("\" placeholder=\"Enter new email\" >\n");
      out.write("\n");
      out.write("  <label for=\"city\">City:</label>\n");
      out.write("  <input type=\"text\" id=\"city\" name=\"city\" value=\"");
      out.print( city );
      out.write("\" placeholder=\"Enter new city\" >\n");
      out.write("\n");
      out.write("   <label for=\"passwordOld\">Old Password:</label>\n");
      out.write("   <input type=\"text\" id=\"password\" name=\"Oldpassword\" value=\"");
      out.print( password );
      out.write("\">\n");
      out.write("  \n");
      out.write("  <label for=\"password\">Password:</label>\n");
      out.write("  <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Enter new password\" value=\"");
      out.print( password );
      out.write("\">\n");
      out.write("\n");
      out.write("  <button type=\"submit\">Update</button>\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
