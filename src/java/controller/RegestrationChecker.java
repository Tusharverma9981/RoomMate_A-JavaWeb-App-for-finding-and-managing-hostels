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

/**
 *
 * @author tv464
 */
@WebServlet(name = "RegestrationChecker", urlPatterns = {"/RegestrationChecker"})
public class RegestrationChecker extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("registration.html");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String Fullname = request.getParameter("Fullname");
       String password = request.getParameter("password");
       String username = request.getParameter("username");
       String city = request.getParameter("city");
       String email = request.getParameter("email");
       String usertype =  request.getParameter("usertype");
       
        Registrationauthenticator authenticator = new   Registrationauthenticator();
        boolean login = authenticator.register(Fullname,username, password,city,email,usertype);
         
       if(login){
             HttpSession  session = request.getSession(true);
             session.setAttribute("username", username);
              session.setAttribute("usertype", usertype);
          
              if("owner".equals(usertype)){
           response.sendRedirect("ownerlogin.html");
              }
              else{
                  response.sendRedirect("login.html");
              }
       }else{
           response.sendRedirect("registration.html");
       }
         
    }
}
