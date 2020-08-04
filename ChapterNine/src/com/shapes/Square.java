package com.shapes;

public class Square implements Quadrilateral {
    private double side;

    public Square(double sideSize){
        side = sideSize;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }
}
