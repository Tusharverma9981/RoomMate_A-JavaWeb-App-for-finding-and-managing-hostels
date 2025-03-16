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
import model.ProflieUpdate;

/**
 *
 * @author tv464
 */
@WebServlet(name = "Updateproflie", urlPatterns = {"/Updateproflie"})
public class Updateproflie extends HttpServlet {
  @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("UpdateProflie.jsp");
    }
     
     @Override
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          
       String Fullname = request.getParameter("Fullname");
       String password = request.getParameter("password");
       String username = request.getParameter("username");
       String city = request.getParameter("city");
       String email = request.getParameter("email");
       String usertype = (String) request.getSession().getAttribute("usertype");
       System.out.print(usertype);
       ProflieUpdate updator = new ProflieUpdate();
       
       boolean Updated = updator.Update(Fullname,username, password,city,email,usertype);
       
       if(Updated){
             HttpSession  session = request.getSession(true);
             session.setAttribute("username", username);
          
             
               if("owner".equals(usertype)){
           response.sendRedirect("proflie.jsp");
               }
               else{
                      response.sendRedirect("proflie.jsp");
               }
       }else{
           if("owner".equals(usertype)){
           response.sendRedirect("home.jsp");
           }
           else{
                   response.sendRedirect("home.jsp");
           }
       }
       
          
      }
    
}
