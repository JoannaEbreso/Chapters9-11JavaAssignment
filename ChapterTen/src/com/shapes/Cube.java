package com.shapes;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side){
        this.side = side;
    }

    @Override
    public double getArea(){
        return Math.pow(side,3);
    }

    @Override
    public double getVolume(){
        return 6 * Math.pow(side,2);
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
                String.format("This is a Cube %n It is a Three Dimensional Shape %n " +
                        "SideLength: %.2f %n Area is: %.2f %n Volume is: %.2f",getSide(),getArea(),getVolume());
    }
}
