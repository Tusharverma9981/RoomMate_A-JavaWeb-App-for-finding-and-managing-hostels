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
public class DeleteUser {
    public boolean delete(String username,String usertype){
         Statement st = Dbconnecter.getStatement();
       try{
           String query5="";
           if("owner".equals(usertype)){
           
            query5="DELETE FROM ownertable WHERE username ='"+username+"'";
           }
           else{
                query5="DELETE FROM usertable WHERE username ='"+username+"'";
           }
           
           System.out.println(query5);
        int i= st.executeUpdate(query5);
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
