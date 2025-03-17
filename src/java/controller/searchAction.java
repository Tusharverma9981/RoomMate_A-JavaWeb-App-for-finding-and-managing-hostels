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
@WebServlet(name = "searchAction", urlPatterns = {"/searchAction"})
public class searchAction extends HttpServlet {
         public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
            String item = request.getParameter("item");
//            String password = request.getParameter("password");
//            String usertype =  request.getParameter("usertype");
             response.sendRedirect("SearchResult.jsp?item="+item+""); 
            
           
    }
}
