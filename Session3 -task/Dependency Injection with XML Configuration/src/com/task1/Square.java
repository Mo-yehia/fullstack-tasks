package com.task1;

public class Square implements Shape{
    private Draw2d draw2d;

    public void setDraw2d (Draw2d draw2d)
    {
        this.draw2d = draw2d;
    }

    @Override
    public void getArea(double length)
    {
        System.out.println("The area of the Square = " + length * length) ;
    }

    @Override
    public void draw2dShape(){
        draw2d.draw("Square");
    }
}
