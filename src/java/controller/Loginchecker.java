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
import model.loginauthenticator;

/**
 *
 * @author tv464
 */
@WebServlet(name = "Loginchecker", urlPatterns = {"/Loginchecker"})
public class Loginchecker extends HttpServlet {
     @Override
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
        response.sendRedirect("login.html");
    }
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String usertype =  request.getParameter("usertype");
            
            UserDTO user = new UserDTO();
            user.setUsername(username);
            user.setPassword(password);
            user.setUser(usertype);
            //System.out.print(usertype);
            
            loginauthenticator l1 = new loginauthenticator();
            boolean login = l1.isLogin(user);
            
            if(login)
            {
                HttpSession session = request.getSession(true);
                session.setAttribute("username", username);
                 session.setAttribute("usertype", usertype);
                
                  if("owner".equals(usertype)){
                response.sendRedirect("home2.jsp");
                  }
                  else{
                       response.sendRedirect("home.jsp"); 
                  }
            }
            else
            {
                response.sendRedirect("loginFail.html");
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(Loginchecker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}