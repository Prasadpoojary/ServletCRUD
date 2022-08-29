/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package src.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import src.bean.User;
import src.dao.UserService;
import static src.servlet.Signup.id;

/**
 *
 * @author ACER
 */
@WebServlet(name = "Update", urlPatterns = {"/Update"})
public class Update extends HttpServlet {

    public static Logger log=Logger.getLogger(UserService.class.getName());

    List<User> users=UserService.allUsers(); 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.info("Entry Udpate method");
        
            int id=Integer.parseInt(request.getParameter("id"));
            User user=UserService.getUser(id);
            request.setAttribute("user", user);
        
           request.getRequestDispatcher("UpdatePage.jsp").forward(request, response);
        
        
        log.info("Exit Udpate method");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String mobile=request.getParameter("mobile");
        int id=Integer.parseInt(request.getParameter("id"));
        User user=new User(id, username, mobile,password);
        UserService.updateUser(user);
        List<User> users=UserService.allUsers(); 
        request.setAttribute("users", users);
        request.getRequestDispatcher("Home.jsp").forward(request, response);
      
        
    }

 

}
