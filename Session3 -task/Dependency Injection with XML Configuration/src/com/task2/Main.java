package com.task2;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Vehicle car = context.getBean("car" , Car.class);
        car.saveToDatabase();

        System.out.println("------------------------------------------------------");

        Vehicle plane = context.getBean("plane" , Plane.class);
        plane.saveToDatabase();
    }
}