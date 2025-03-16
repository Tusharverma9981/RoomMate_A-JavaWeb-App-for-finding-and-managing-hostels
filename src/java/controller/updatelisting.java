/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.listingUpdate;
import model.loginauthenticator;

/**
 *
 * @author tv464
 */
@WebServlet(name = "updatelisting", urlPatterns = {"/updatelisting"})
public class updatelisting extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
       String title = request.getParameter("title");
       String description = request.getParameter("description");
       String price = request.getParameter("price");
       String city = request.getParameter("city");
       String location = request.getParameter("location");
       String owner = request.getParameter("owner");
       
        listingUpdate updator = new listingUpdate();
        
         boolean Updatedlist = updator.Update(title,description,price,location,city,owner);
         if(Updatedlist){
           response.sendRedirect("ownlisting.jsp?title="+title+"");
       }else{
           response.sendRedirect("newListing.jsp");
       }
        
    }

}
