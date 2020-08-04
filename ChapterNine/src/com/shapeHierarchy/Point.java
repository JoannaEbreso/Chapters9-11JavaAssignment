package com.shapeHierarchy;

public class Point {
    private int Xcoordinate;
    private int Ycoordinate;

    public Point(int Xcoordinate,int Ycoordinate){
        this.Xcoordinate = Xcoordinate;
        this.Ycoordinate = Ycoordinate;
    }

    public int getXcoordinate() {
        return Xcoordinate;
    }

    public void setXcoordinate(int xcoordinate) {
        Xcoordinate = xcoordinate;
    }

    public int getYcoordinate() {
        return Ycoordinate;
    }

    public void setYcoordinate(int ycoordinate) {
        Ycoordinate = ycoordinate;
    }
}
