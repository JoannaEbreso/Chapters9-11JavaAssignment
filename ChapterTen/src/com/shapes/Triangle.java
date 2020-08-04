package com.shapes;

public class Triangle extends TwoDimensionalShape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){
        return (base * height)/2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return
                String.format("This is a Triangle %n It is a Two Dimensional Shape %n " +
                        "Base: %.2f %n Height: %.2f %n Area is: %.2f",getBase(),getHeight(),getArea());
    }
}
