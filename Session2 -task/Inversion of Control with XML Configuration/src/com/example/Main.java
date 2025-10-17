package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shape circle = context.getBean("circle" , Circle.class);
        circle.getArea(3);

        Shape square = context.getBean("square" , Square.class);
        square.getArea(3);

    }
}