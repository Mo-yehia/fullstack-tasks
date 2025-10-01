package com.task1;

public class Circle implements Shape {
    private final Draw2d draw2d;

    public Circle(Draw2d draw2d){
        this.draw2d = draw2d;
    }

    @Override
    public void getArea(double radius) {
        System.out.println("The area of the circle = " + Math.PI * radius * radius) ;
    }

    @Override
    public void draw2dShape(){
        draw2d.draw("Circle");
    }
}
