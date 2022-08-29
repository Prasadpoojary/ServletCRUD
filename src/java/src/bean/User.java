/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.bean;

/**
 *
 * @author ACER
 */
public class User 
{


    private int id;
    private String username;
    private String mobile;
    private String password;

    public User(int id, String username, String mobile, String password) 
    {
        this.id = id;
        this.username = username;
        this.mobile = mobile;
        this.password = password;
    }

    public User(String username, String mobile, String password) 
    {
        this.username = username;
        this.mobile = mobile;
        this.password = password;
    }

    public User() 
    {
        
    }
    
  
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
 
  
    
    public String getUsername() {
        return username;
    }

    
    public void setUsername(String username) {
        this.username = username;
    }

   
    public String getMobile() {
        return mobile;
    }

   
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }
   
    
    
}
