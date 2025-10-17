package main.com.myApp.dao;

import main.com.myApp.config.DatabaseConfig;
import main.com.myApp.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class UserDao {

    @Autowired
    private DatabaseConfig dbConfig;



    public void saveUser(UserModel user) throws SQLException {
        String query = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
        try (PreparedStatement ps = dbConfig.getConnection().prepareStatement(query)){

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());

            ps.executeUpdate();

            System.out.println("User saved successfully!");

        }
    }
}
