/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package src.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import src.bean.User;
import src.dao.UserService;
import java.util.logging.Logger;


/**
 *
 * @author ACER
 */
@WebServlet(name = "Home", urlPatterns = {"/"})
public class Home extends HttpServlet {
    
    Logger log=Logger.getLogger(Home.class.getName());

  
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.info("Entry  fetchUsers");
        List<User> users=UserService.allUsers(); 
        request.setAttribute("users", users);
        
        request.getRequestDispatcher("Home.jsp").forward(request, response);
        log.info("Exit  fetchUsers");
    }

}
