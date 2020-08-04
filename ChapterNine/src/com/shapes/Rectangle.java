package com.shapes;

public class Rectangle implements Quadrilateral {

    private double length;
    private double breadth;

    public Rectangle(double length, double side){
        this.length = length;
        breadth = side;
    }

    public double calculateArea(){
        return length * breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
