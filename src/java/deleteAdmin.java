/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import db.Dbconnecter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tv464
 */
@WebServlet(urlPatterns = {"/deleteAdmin"})
public class deleteAdmin extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    { 
        String query5="";
         String title="";
          String username="";
        
       String type = request.getParameter("type");
       if("listing".equals(type)){
             title = request.getParameter("title");
       }
       else if("owner".equals(type)){
            username = request.getParameter("username");
       }
       else{
             username = request.getParameter("username");
       }
        System.out.print(username);
        System.out.print(title);
        System.out.print(type);
        
        
        
       try{
           
            Statement st = Dbconnecter.getStatement();
           
            
       if("listing".equals(type)){
            query5="DELETE FROM listingtable WHERE title ='"+title+"'";
       }
       else if("owner".equals(type)){
           query5="DELETE FROM ownertable WHERE username ='"+username+"'";
       }
       else{
           query5="DELETE FROM usertable WHERE username ='"+username+"'";
       }
           
     
           
           System.out.println(query5);
        int i= st.executeUpdate(query5);
        if(i>0){
            
             
             
              if("listing".equals(type)){
       response.sendRedirect("manageListings.jsp");
       }
       else if("owner".equals(type)){
             response.sendRedirect("manageOwners.jsp");
       }
       else{
             response.sendRedirect("manageUsers.jsp");
       }
             
        }else{
            if("listing".equals(type)){
       response.sendRedirect("manageListings.jsp");
       }
       else if("owner".equals(type)){
             response.sendRedirect("manageOwners.jsp");
       }
       else{
             response.sendRedirect("manageUsers.jsp");
       }
        }
        
       // con.close();
       }
       catch(SQLException e){
           System.out.println(e);
       }
    }
}
