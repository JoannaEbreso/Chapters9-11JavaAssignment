package com.kingdom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createHierarchy(){
        Animal anAnimal = new Animal(4);
        anAnimal.move();
        Eagle anEagle = new Eagle();
        anEagle.move();

        Python pytin = new Python(0);
        Nose imu = new Nose();
        pytin.setBreather(imu);
        Eye leftEye = new Eye();
        Eye rightEye = new Eye();
        pytin.getEyes().add(rightEye);
        pytin.getEyes().add(leftEye);
        pytin.move();
        pytin.eat();
    }

    @Test
    void hierarchyTest(){
        Eagle asa = new Eagle();
        Animal ugo = new Eagle();

        Fish eja = new Fish();
        Frog opolo = new Frog();
        Animal[] animals = {asa,ugo,eja,opolo};

        for(Animal animal: animals){
            animal.move();
        }
    }
}