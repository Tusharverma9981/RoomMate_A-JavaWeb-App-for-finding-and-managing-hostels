/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Pankaj
 */
public class UserDTO 
{
    private String username,password,id,city,salary,usertype;

    public String getUsername() {
        return username;
    }
    
     public String getId() {
        return id;
    }

      public String getCity() {
        return city;
    }

      public String getSalary() {
        return salary;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
     public void setUser(String usertype) {
        this.usertype = usertype;
    }
     
      public String getUser() {
        return usertype;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}