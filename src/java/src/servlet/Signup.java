/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package src.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import src.bean.User;
import src.dao.UserService;
import java.util.logging.Logger;
/**
 *
 * @author ACER
 */
@WebServlet(name = "Signup", urlPatterns = {"/Signup"})
public class Signup extends HttpServlet {
    
    Logger log=Logger.getLogger(Signup.class.getName());
    
    public static int id=1;
    
  
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.info("Get Request for Register user");
        request.getRequestDispatcher("Register.jsp").forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String mobile=request.getParameter("mobile");
        User user=new User(id++,username,mobile,password);
        log.info("Post Request for Register user");

        if(UserService.register(user))
        {
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
        else 
        {
            request.getRequestDispatcher("Register.jsp").forward(request, response);
        }
            
      }

}
