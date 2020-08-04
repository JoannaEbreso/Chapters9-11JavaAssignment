package com.shapes;

public class Parallelogram implements Quadrilateral {
    private double base;
    private double height;

    public Parallelogram(double base, double height){
       this.base = base;
       this.height = height;
    }

    @Override
    public double calculateArea(){
        return base * height;
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
}
