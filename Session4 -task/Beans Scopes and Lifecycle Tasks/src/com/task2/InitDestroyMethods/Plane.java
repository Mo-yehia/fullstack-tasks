package com.task2.InitDestroyMethods;

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
