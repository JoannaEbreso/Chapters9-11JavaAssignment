package com.shapes;

public class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double getArea(){
       return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString(){
        return
                String.format("This is a Square %n It is a Two Dimensional Shape %n " +
                        "SideLength: %.2f %n Area is: %.2f",getSide(),getArea());
    }
}
