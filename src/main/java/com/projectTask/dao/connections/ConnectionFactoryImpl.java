package com.projectTask.dao.connections;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactoryImpl implements ConnectionFactory {

    private static HikariDataSource dataSource;

    static {
        try {
            MysqlDataSource mysqlDS = new MysqlDataSource();
            mysqlDS.setUrl("jdbc:mysql://localhost:3306/projecttask");
            mysqlDS.setUser("root");
            mysqlDS.setPassword("Mdjaved2004");

            HikariConfig config = new HikariConfig();
            config.setDataSource(mysqlDS);
            config.setMaximumPoolSize(10);
            config.setMinimumIdle(3);
            config.setIdleTimeout(30000);
            config.setConnectionTimeout(30000);
            config.setPoolName("ProjectTaskPool");

            dataSource = new HikariDataSource(config);
            System.out.println("HikariCP Initialized Successfully");

        } catch (Exception e) {
            System.out.println("Failed to initialize HikariCP");
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
