package com.shapeHierarchy;

public class Trapezoid extends Quadrilateral {
    private double topLength;
    private double bottomLength;
    private double height;

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

    @Override
    public double calculateArea(){
        return ((topLength + bottomLength)/2) * height;
    }
}
