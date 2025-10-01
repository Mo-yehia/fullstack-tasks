package com.example;

public class Square implements Shape{

    @Override
    public void getArea(double length) {
        System.out.println("The area of the Square = " + length * length) ;
    }
}
