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
import model.DeleteUser;

/**
 *
 * @author tv464
 */
@WebServlet(name = "DeleteProfile", urlPatterns = {"/DeleteProfile"})
public class DeleteProfile extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
      //  String username = "";
        //String username = (String)session.getAttribute("username");
        String username = (String) request.getSession().getAttribute("username");
         String usertype = (String) request.getSession().getAttribute("usertype");
         

//String username = user.getusername();
        //Registrationauthenticator authenticator = new   Registrationauthenticator();
        DeleteUser deleteuser = new DeleteUser();
        boolean delete = deleteuser.delete(username,usertype);
         
       if(delete){
            if("owner".equals(usertype)){
           response.sendRedirect("ownerlogin.html");
            }
            else{
               response.sendRedirect("login.html"); 
            }
       }else{
            if("owner".equals(usertype)){
           response.sendRedirect("ownerprofile.jsp");
            }
            else{
                  response.sendRedirect("profile.jsp");
            }
       } 
    }
}
