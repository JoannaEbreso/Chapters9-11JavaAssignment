package com.shapes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuadrilateralTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateArea() {
        Quadrilateral aRectangle = new Rectangle(5,12);
        Quadrilateral aSquare = new Square(4);
        Quadrilateral aTrape = new Trapezium(3,7,9);
        Quadrilateral aParallelogram = new Parallelogram(12,10);

        List<Quadrilateral> quads = new ArrayList<>();
        quads.add(aRectangle);
        quads.add(aSquare);
        quads.add(aTrape);
        quads.add(aParallelogram);

        //Square trySquare;
        for (Quadrilateral quad : quads){
            System.out.println(quad.calculateArea());
            if(quad instanceof Square){
                System.out.println("Hooray!!! I found a square!");
              //  trySquare = (Square) quad;    //downcasting
            }
        }
    }
}