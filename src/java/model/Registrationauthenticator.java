/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.Dbconnecter;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tv464
 */
public class Registrationauthenticator {
    public boolean register(String Fullname,String username,String password,String city,String email,String usertype){
         Statement st = Dbconnecter.getStatement();
       try{
           String query2="";
           if("owner".equals(usertype)){
            query2="INSERT INTO ownertable values('"+Fullname+"','"+username+"','"+email+"','"+password+"','"+city+"')";
           }
           else{
                query2="INSERT INTO usertable values('"+Fullname+"','"+username+"','"+email+"','"+password+"','"+city+"')";
           }
           System.out.println(query2);
        int i= st.executeUpdate(query2);
        if(i>0){
            
            return true;
        }else{
            return false;
        }
        
       // con.close();
       }
       catch(SQLException e){
           System.out.println(e);
       }  
    return false;
            }
}
