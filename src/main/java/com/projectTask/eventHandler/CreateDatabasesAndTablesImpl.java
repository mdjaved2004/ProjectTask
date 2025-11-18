package com.projectTask.eventHandler;

import java.sql.Connection;
import java.sql.Statement;


public class CreateDatabasesAndTablesImpl implements CreateDatabasesAndTables {
	
    @Override
    public boolean createTablesForProjectTask() {

        try (Connection con = new DBConnection().getConnection();
             Statement st = con.createStatement()) {

            String projects = "CREATE TABLE IF NOT EXISTS projects ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "project_name VARCHAR(100),"
                    + "project_desc TEXT,"
                    + "image VARCHAR(200)"
                    + ")";

            String clients = "CREATE TABLE IF NOT EXISTS clients ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "client_name VARCHAR(100),"
                    + "designation VARCHAR(100),"
                    + "description TEXT,"
                    + "image VARCHAR(200)"
                    + ")";

            String contact = "CREATE TABLE IF NOT EXISTS contact ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "full_name VARCHAR(100),"
                    + "email VARCHAR(100),"
                    + "mobile VARCHAR(20),"
                    + "city VARCHAR(100)"
                    + ")";

            String newsletter = "CREATE TABLE IF NOT EXISTS newsletter ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "email VARCHAR(100) UNIQUE"
                    + ")";
            String createQuoteTable = "CREATE TABLE IF NOT EXISTS projecttask.quote_form ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "name VARCHAR(100) NOT NULL, "
                    + "phone VARCHAR(15) NOT NULL, "
                    + "service VARCHAR(50) NOT NULL, "
                    + "message TEXT"
                    + ")";


            // Create tables
            st.execute(projects);
            st.execute(clients);
            st.execute(contact);
            st.execute(newsletter);
            st.execute(createQuoteTable);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
