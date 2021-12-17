/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Himanshu
 */
public class Register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Register</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String name = request.getParameter("user_name");
            String email = request.getParameter("user_email");
            String password = request.getParameter("user_password");
            
            out.println("<h1>"+name+"</h1>");
            out.println("<h1>"+email+"</h1>");
            out.println("<h1>"+password+"</h1>");
            
            connectwithdb(out,name,email,password);
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    public void connectwithdb(PrintWriter out,String name,String email,String password)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String databasepath = "jdbc:mysql://localhost:3306/newdb";
            
            String username = "root";
            
            String userpassword = "Omnama#12";
            
            Connection connection = DriverManager.getConnection(databasepath,username,userpassword);
            
            if(connection.isClosed())
                out.println("Connection is still closed.");
            else
                out.println("Connection is open");
            String q1 = "insert into user(username,useremail,userapassword) values(?,?,?)";
        
            PreparedStatement pstmt = connection.prepareStatement(q1);
            
            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setString(3,password);
            
            int n = pstmt.executeUpdate();
            
            if(n>=1)
            {
                 out.println("Values has been added in database.");
                 out.println("Name : "+name);
                 out.println("Email : "+email);
                 out.println("Password : "+password);
            }
        }
        catch(Exception e)
        {
            out.println("error catched.");
            
            out.println(e);
        }
        
    }

}
