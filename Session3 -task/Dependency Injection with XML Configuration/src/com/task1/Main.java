package com.task1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shape circle = context.getBean("circle", Circle.class);
        circle.draw2dShape();

        Shape square = context.getBean("square" , Square.class);
        square.draw2dShape();


    }
}