package com.shapeHierarchy;

public abstract class Quadrilateral {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Quadrilateral(Point pointA,Point pointB,Point pointC,Point pointD){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public abstract double calculateArea();
}
