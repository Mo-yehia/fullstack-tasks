package com.task1.VehiclesSystem.controller;

import com.task1.VehiclesSystem.models.Vehicle;
import com.task1.VehiclesSystem.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;


    public void addVehicle(Vehicle vehicle) throws SQLException {
        vehicleService.addVehicle(vehicle);
    }

    public void deleteVehicle(int id) throws SQLException {
        vehicleService.deleteVehicle(id);
    }



public void findVehicleById(int id) throws SQLException {
        Vehicle foundVehicle = vehicleService.findVehicleById(id);
        System.out.println(foundVehicle.toString());
}

    public void getAllVehicles() throws SQLException {
        System.out.println("=== All Vehicles ===");
        List<Vehicle> allVehicles = vehicleService.getAllVehicles();
        allVehicles.forEach(System.out::println);
    }




    public void updateVehicle(Vehicle updatedVehicle) throws SQLException {

        vehicleService.updateVehicle(updatedVehicle);

        System.out.println("=== After Update ===");
        vehicleService.getAllVehicles().forEach(System.out::println);

    }

}
