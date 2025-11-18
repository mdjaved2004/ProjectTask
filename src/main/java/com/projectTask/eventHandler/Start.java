package com.projectTask.eventHandler;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Start implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        try {
            System.out.println("ProjectTask Application Starting...");

            CreateDatabasesAndTablesImpl cdt = new CreateDatabasesAndTablesImpl();

            boolean tables = cdt.createTablesForProjectTask();

            if (tables) {
                System.out.println("ProjectTask Database + Tables Ready.");
            } else {
                System.out.println("Failed to create Tables.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ProjectTask Application Stopped.");
    }
}
