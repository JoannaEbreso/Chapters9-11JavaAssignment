package com.shapes;

public class Tetrahedron extends ThreeDimensionalShape {
    private double edgeLength;

    public Tetrahedron(double edgeLength){
        this.edgeLength = edgeLength;
    }

    @Override
    public double getArea(){
        return Math.sqrt(3)*Math.pow(edgeLength,2);
    }

    @Override
    public double getVolume(){
        return (Math.sqrt(2)*Math.pow(edgeLength,3))/12;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public String toString(){
        return
                String.format("This is a Tetrahedron %n It is a Three Dimensional Shape %n " +
                        "EdgeLength: %.2f %n Area is: %.2f %n Volume is: %.2f",getEdgeLength(),getArea(),getVolume());
    }
}
