package com.example;

public class Circle implements Shape{

    @Override
    public void getArea(double radius) {
        System.out.println("The area of the circle = " + Math.PI * radius * radius) ;
    }
}
