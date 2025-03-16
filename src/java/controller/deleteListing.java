/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
@WebServlet(name = "deleteListing", urlPatterns = {"/deleteListing"})
public class deleteListing extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    { 
          String title = request.getParameter("title");
            Statement st = Dbconnecter.getStatement();
       try{
           String query5="";
          
           
            query5="DELETE FROM listingtable WHERE title ='"+title+"'";
           
     
           
           System.out.println(query5);
        int i= st.executeUpdate(query5);
        if(i>0){
            
             response.sendRedirect("index.html");
        }else{
            response.sendRedirect( "ownlisting.jsp?title="+title+"");
        }
        
       // con.close();
       }
       catch(SQLException e){
           System.out.println(e);
       }
    }
}
