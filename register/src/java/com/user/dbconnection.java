package com.user;

import java.sql.*;

public class dbconnection 
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String databasepath = "jdbc:mysql://localhost:3306/newdb";
            
            String username = "root";
            
            String password = "Omnama#12";
            
            Connection connection = DriverManager.getConnection(databasepath,username,password);
            
            if(connection.isClosed())
                System.out.println("Connection is still closed.");
            else
                System.out.println("Connection is open");
        }
        catch(Exception e)
        {
            System.out.println("error catched.");
            
            System.out.println(e);
    
        }
    }
}
