package com.projectTask.eventHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            // IMPORTANT: Always connect with database
            String url = "jdbc:mysql://localhost:3306/projecttask"; 
            String username = "root";
            String password = "Mdjaved2004";

            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to projecttask DB");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
