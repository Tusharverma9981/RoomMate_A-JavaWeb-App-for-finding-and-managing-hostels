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
public class uploadListings {
     public boolean upload(String title,String description,String price,String city,String location,String owner,String image){
         Statement st = Dbconnecter.getStatement();
       try{
           String query2="INSERT INTO listingtable values('"+title+"','"+description+"','"+price+"','"+city+"','"+location+"','"+owner+"','"+image+"')";
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
