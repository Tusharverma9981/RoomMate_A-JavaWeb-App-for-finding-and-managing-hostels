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
@WebServlet(name = "rentListing", urlPatterns = {"/rentListing"})
public class rentListing extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
 { 
        String query5="";
         String title=request.getParameter("title");
          
        String status = "booked";
     
        System.out.print(title);
        
        
        
        
       try{
           
            Statement st = Dbconnecter.getStatement();
           
            
        query5="UPDATE listingtable SET status='"+status+"' WHERE title='"+title+"' ";
           
     
           
           System.out.println(query5);
        int i= st.executeUpdate(query5);
        if(i>0){
       response.sendRedirect("home.jsp");
        }else{
       response.sendRedirect("listing.jsp?title="+title+"");
       }
       // con.close();
       }
       catch(SQLException e){
           System.out.println(e);
       }
    }
}
