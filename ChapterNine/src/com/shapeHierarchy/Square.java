package com.shapeHierarchy;

public class Square extends Quadrilateral {
    private double side;

    public Square(Point pointA,Point pointB,Point pointC,Point pointD,double Side){
        super(pointA,pointB,pointC,pointD);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea(){
        return side*side;
    }
}
