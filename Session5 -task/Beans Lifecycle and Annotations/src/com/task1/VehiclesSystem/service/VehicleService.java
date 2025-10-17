package com.task1.VehiclesSystem.service;

import com.task1.VehiclesSystem.dao.CarDao;
import com.task1.VehiclesSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class VehicleService {
    @Autowired
    private CarDao carDao;



    public void addVehicle(Vehicle vehicle) throws SQLException {
        carDao.save(vehicle);
    }

    public void updateVehicle(Vehicle vehicle) throws SQLException {
        carDao.update(vehicle);
    }

    public void deleteVehicle(int id) throws SQLException {
        carDao.delete(id);
    }

    public Vehicle findVehicleById(int id) throws SQLException {
        return carDao.findById(id);
    }

    public List<Vehicle> getAllVehicles() throws SQLException {
        return carDao.findAll();
    }
}
