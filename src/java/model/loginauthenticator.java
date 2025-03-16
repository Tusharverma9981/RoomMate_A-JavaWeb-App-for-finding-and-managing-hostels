/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.Dbconnecter;
import dto.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tv464
 */
public class loginauthenticator {
     public boolean isLogin(UserDTO user) throws SQLException{
         String username = user.getUsername();
        String password = user.getPassword();
        String usertype = user.getUser();
        System.out.print(usertype);
        String tablepassword = "";
        //String tableusername = "";
        Statement st = Dbconnecter.getStatement();
        try{
             String query = "";
            if("owner".equals(usertype)){
             query = "SELECT password FROM ownertable WHERE username='"+username+"'";
             System.out.print("owner");
            }
            else {
                query = "SELECT password FROM usertable WHERE username='"+username+"'";
                System.out.print("customer");
            }
             System.out.println(query);
             
             ResultSet rs=st.executeQuery(query);
             if(rs.next()){
                
                 tablepassword = rs.getString(1);
            }
        }
         catch(SQLException e){
            System.out.println(e);
        }
        if(username!=null && password!=null && !username.trim().equals("") && password.equals(tablepassword)){
       return true;
        }
    return false;
    }
}
