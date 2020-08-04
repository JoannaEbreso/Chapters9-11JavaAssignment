package com.shapes;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radiusOfCircle){
        radius = radiusOfCircle;
    }

    @Override
    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return
                String.format("This is a Circle %n It is a Two Dimensional Shape %n " +
                        "It has a radius of %.2f %n Area is: %.2f",getRadius(),getArea());
    }
}
