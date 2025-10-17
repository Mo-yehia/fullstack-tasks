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
        String query = "INSERT INTO users (first_name, last_name, email, dob, city) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = dbConfig.getConnection().prepareStatement(query)){

            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmail());
            ps.setDate(4, Date.valueOf(user.getDateOfBirth()));
            ps.setString(5, user.getCity());
            ps.executeUpdate();

            System.out.println("User saved successfully!");

        }
    }
}
