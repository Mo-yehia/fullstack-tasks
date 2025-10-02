package com.task1.VehiclesSystem;



import com.task1.VehiclesSystem.config.AppConfig;
import com.task1.VehiclesSystem.controller.VehicleController;
import com.task1.VehiclesSystem.models.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        VehicleController vehicleController = context.getBean(VehicleController.class);


        vehicleController.addVehicle(new Vehicle(7, "car", "Toyota", "Black"));

        vehicleController.deleteVehicle(8);

        vehicleController.findVehicleById(5);

        vehicleController.getAllVehicles();

        vehicleController.updateVehicle(new Vehicle(7, "Plane", "Boeing", "Silver"));


        ((AnnotationConfigApplicationContext) context).close();
    }
}