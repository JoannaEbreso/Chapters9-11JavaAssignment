package com.shapes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateAreaAndVolume(){
        List<Shape> listOfShapes = new ArrayList<>();
        Shape circle1 = new Circle(5);
        listOfShapes.add(circle1);
        Shape circle2 = new Circle(10);
        listOfShapes.add(circle2);
        Shape triangle = new Triangle(5,8);
        listOfShapes.add(triangle);
        Shape tetrahedron1 = new Tetrahedron(4);
        listOfShapes.add(tetrahedron1);
        Shape tetrahedron2 = new Tetrahedron(12);
        listOfShapes.add(tetrahedron2);

        for(Shape object:listOfShapes){
            System.out.println(object);
            System.out.println();
        }
    }
}