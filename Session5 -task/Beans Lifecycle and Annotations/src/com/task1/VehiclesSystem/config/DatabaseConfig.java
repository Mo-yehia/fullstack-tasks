package com.task1.VehiclesSystem.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

@Component
@Scope("singleton")
@Getter
@Setter
public class DatabaseConfig {
    @Value("${database.url}")
    private String url;

    @Value("${database.username}")
    private String username;

    @Value("${database.password}")
    private String password;

    private Connection connection;


    @PostConstruct
    public void connectToDatabase(){
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection established ……");
        } catch (SQLException e) {
            throw new RuntimeException("Database connection error!", e);
        }
    }

    @PreDestroy
    public void disconnectFromDatabase(){
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database connection closed ……");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



//    private Connection getConnection(){
//        try{
//            Connection connection = DriverManager.getConnection(url, username, password);
//            System.out.println("Database connected successfully");
//        return connection;
//        }catch (Exception e){
//            System.out.println("Database not connected !");
//            e.printStackTrace();

//        }throw new RuntimeException("Database connection error!");
//    }
//
//    private PreparedStatement getStatement(String query) {
//        try {
//            PreparedStatement statement = this
//                    .getConnection()
//                    .prepareStatement(query);
//            return statement;
//        }catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("error in statement !" + e.getMessage());
//        }
//    }
//
//
//    public ResultSet getResult(String query) {
//        try {
//            ResultSet rs = getStatement(query).executeQuery();
//            return rs;
//        }catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("error in resultset !" + e.getMessage());
//        }

//    }





}
