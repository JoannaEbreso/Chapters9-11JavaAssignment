package com.shapes;

public class Trapezium implements Quadrilateral {
    private double topLength;
    private double bottomLength;
    private double height;

    public Trapezium(double topLength, double bottomLength, double height){
        this.topLength = topLength;
        this.bottomLength = bottomLength;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return ((topLength + bottomLength)/2) * height;
    }

    public double getTopLength() {
        return topLength;
    }

    public void setTopLength(double topLength) {
        this.topLength = topLength;
    }

    public double getBottomLength() {
        return bottomLength;
    }

    public void setBottomLength(double bottomLength) {
        this.bottomLength = bottomLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
