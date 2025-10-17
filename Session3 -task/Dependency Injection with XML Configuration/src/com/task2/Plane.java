package com.task2;

public class Plane implements Vehicle{
    DatabaseOperation databaseOperation;

    public void setDatabaseOperation(DatabaseOperation databaseOperation)
    {
        this.databaseOperation =  databaseOperation;
    }

    public void saveToDatabase()
    {
        databaseOperation.saveToDatabase("Airbus");
    }
}
