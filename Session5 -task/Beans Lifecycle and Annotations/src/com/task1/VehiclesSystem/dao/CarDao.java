package com.task1.VehiclesSystem.dao;

import com.task1.VehiclesSystem.config.DatabaseConfig;
import com.task1.VehiclesSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao implements VehicleDao<Vehicle> {

    @Autowired
    private DatabaseConfig dbConfig;

    @Override
    public void save(Vehicle vehicle) throws SQLException {
        String query = "INSERT INTO Vehicles (type, brand, color) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = dbConfig.getConnection().prepareStatement(query)) {
            stmt.setString(1, vehicle.getType());
            stmt.setString(2, vehicle.getBrand());
            stmt.setString(3, vehicle.getColor());
            stmt.executeUpdate();
        }
    }

    @Override
    public void update(Vehicle vehicle) throws SQLException {
        String query = "UPDATE Vehicles SET type=?, brand=?, color=? WHERE id=?";
        try (PreparedStatement stmt = dbConfig.getConnection().prepareStatement(query)) {
            stmt.setString(1, vehicle.getType());
            stmt.setString(2, vehicle.getBrand());
            stmt.setString(3, vehicle.getColor());
            stmt.setInt(4, vehicle.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM Vehicles WHERE id=?";
        try (PreparedStatement stmt = dbConfig.getConnection().prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    @Override
    public Vehicle findById(int id) throws SQLException {
        String query = "SELECT * FROM Vehicles WHERE id=?";
        try (PreparedStatement stmt = dbConfig.getConnection().prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Vehicle(
                        rs.getInt("id"),
                        rs.getString("type"),
                        rs.getString("brand"),
                        rs.getString("color")
                );

            }
        }
        return null;
    }

    @Override
    public List<Vehicle> findAll() throws SQLException {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM Vehicles";
        try (Statement stmt = dbConfig.getConnection().createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
            int id = rs.getInt("id");
            String type = rs.getString("type");
            String brand = rs.getString("brand");
            String color = rs.getString("color");

            System.out.println(
                    "id : " + id
                            + " | type : " + type
                            + " | brand : " + brand
                            + " | color : " + color);
            }

        }
        return vehicles;
    }


}

