package com.task2.InitDestroyMethods;

public class Car implements Vehicle{
    DatabaseOperation databaseOperation;

    public Car (DatabaseOperation databaseOperation)
    {
        this.databaseOperation =  databaseOperation;
    }

    public void saveToDatabase()
    {
        databaseOperation.saveToDatabase("BMW");
    }
}
