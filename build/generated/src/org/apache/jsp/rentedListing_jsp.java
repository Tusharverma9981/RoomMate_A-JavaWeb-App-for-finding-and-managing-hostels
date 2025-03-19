package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.Dbconnecter;
import java.sql.Statement;
import java.sql.ResultSet;

public final class rentedListing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Manage Users</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #121212;\n");
      out.write("            color: #ffffff;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background-color: #1e1e1e;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ffffff;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #333;\n");
      out.write("        }\n");
      out.write("        a {\n");
      out.write("            color: #00bcd4;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        .home-button {\n");
      out.write("            display: inline-block;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #00bcd4;\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        .home-button:hover {\n");
      out.write("            background-color: #008c9e;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Information of all the Listing</h2>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Title</th>\n");
      out.write("                <th>Description</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Location</th>\n");
      out.write("                <th>City</th>\n");
      out.write("                 <th>Owner</th>\n");
      out.write("                 \n");
      out.write("                <th>Image</th>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("            ");
 
                
              
                ResultSet rs = null;
                try {
                    
                    
                   Statement  stmt = Dbconnecter.getStatement();
                    rs = stmt.executeQuery("SELECT  * FROM listingtable WHERE  status='booked'");
                    while (rs.next()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( rs.getString("title") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("description") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("price") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("location") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("city") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("owner") );
      out.write("</td>\n");
      out.write("               \n");
      out.write("                <td><a href=\"");
      out.print( rs.getString("image"));
      out.write("\">Image Link</a></td>\n");
      out.write("                     \n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("         <a href=\"adminHome.html\" class=\"home-button\">Go to Dashboard</a>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
