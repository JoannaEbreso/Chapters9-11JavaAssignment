package com.shapes;

public class Sphere extends ThreeDimensionalShape{
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 4*(Math.PI*Math.pow(radius,2));
    }

    @Override
    public double getVolume(){
        return (4/3)*(Math.PI*Math.pow(radius,3));
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
                String.format("This is a Sphere %n It is a Three Dimensional Shape %n " +
                        "It has a radius of %.2f %n Area is: %.2f %n Volume is: %.2f",getRadius(),getArea(),getVolume());
    }
}
