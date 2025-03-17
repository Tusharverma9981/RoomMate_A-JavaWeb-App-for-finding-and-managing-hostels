/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Registrationauthenticator;
import model.uploadListings;

/**
 *
 * @author tv464
 */
@WebServlet(name = "uploadListing", urlPatterns = {"/uploadListing"})
public class uploadListing extends HttpServlet {
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String title = request.getParameter("title");
       String description = request.getParameter("description");
       String price = request.getParameter("price");
       String city = request.getParameter("city");
       String location = request.getParameter("location");
       String owner = request.getParameter("owner");
       String image = request.getParameter("image");
       
        uploadListings uploader = new   uploadListings();
        boolean login = uploader.upload(title,description,price,location,city,owner,image);
         
       if(login){
             HttpSession  session = request.getSession(true);
             
          
           response.sendRedirect("home2.jsp");
       }else{
           response.sendRedirect("newListing.jsp");
       }
         
    }
}
