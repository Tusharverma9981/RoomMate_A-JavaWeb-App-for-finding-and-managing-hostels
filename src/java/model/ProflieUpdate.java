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
public class ProflieUpdate {
     public boolean Update(String Fullname,String username,String password,String city,String email,String usertype){
         Statement st = Dbconnecter.getStatement();
       try{
          // String query4="INSERT INTO swingdatabase values('"+id+"','"+username+"','"+password+"','"+city+"','"+salary+"')";
           //UPDATE users SET email='newemail@example.com', password='newsecurepassword' WHERE username='john_doe';
           
           String query4="";
           
           if("owner".equals(usertype)){
             query4="UPDATE ownertable SET username='"+username+"',password='"+password+"',owner='"+Fullname+"',city='"+city+"',email='"+email+"' WHERE username='"+username+"' ";
           }
           else{
               query4="UPDATE usertable SET username='"+username+"',password='"+password+"',fullname='"+Fullname+"',city='"+city+"',email='"+email+"' WHERE username='"+username+"' ";
           }
           System.out.println(query4);
        int i= st.executeUpdate(query4);
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
