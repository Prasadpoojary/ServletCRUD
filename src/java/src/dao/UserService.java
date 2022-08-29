/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.dao;

import java.util.ArrayList;
import java.util.List;
import src.bean.User;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class UserService 
{
    public static Logger log=Logger.getLogger(UserService.class.getName());
    public static  List<User> users=new ArrayList<>();
   
    
    public static boolean register(User user)
    {
        log.info("Entry Register method");
        users.add(user);
        log.info("Exit Register method");
        return true;
    }
    
    
    public static boolean login(String username, String password)
    {
       log.info("Entry  Login method");
       User user=users.stream().filter(u -> (u.getUsername().equals(username) && u.getPassword().equals(password))).findFirst().orElse(null);
       log.info("Exit  Login method");
       return user!=null;  
    }
    
        
    public static User getUser(int id)
    {
       log.info("Entry  getUser method");
       User user=users.stream().filter(u -> (u.getId()==id )).findFirst().orElse(null);
       log.info("Exit  getUser method");
       return user;
    }
    
    public static void updateUser(User upUser)
    {
       log.info("Entry  updateUser method");
       User user=users.stream().filter(u -> (u.getId()==upUser.getId() )).findFirst().orElse(null);
       user.setUsername(upUser.getUsername());
       user.setMobile(upUser.getMobile());
       user.setPassword(upUser.getPassword());
       log.info("Exit  updateUser method");
    }
    
    public static void deleteUser(int id)
    {
       log.info("Entry  deleteUser method");
       User user=users.stream().filter(u -> (u.getId()==id )).findFirst().orElse(null);
       users.remove(user);
       log.info("Exit  deleteUser method");
    }
    
    public static List<User> allUsers()
    {
        return users;
    }
    
}
