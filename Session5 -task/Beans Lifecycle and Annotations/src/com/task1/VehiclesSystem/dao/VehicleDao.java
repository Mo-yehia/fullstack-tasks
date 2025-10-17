package com.task1.VehiclesSystem.dao;

import java.sql.SQLException;
import java.util.List;

public interface VehicleDao <T> {

    void save(T vehicle) throws SQLException;

    void update(T vehicle) throws SQLException;

    void delete(int id) throws SQLException;

    T findById(int id) throws SQLException;

    List<T> findAll() throws SQLException;

}
