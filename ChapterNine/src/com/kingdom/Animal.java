package com.kingdom;
import java.util.ArrayList;
import java.util.List;

//public abstract class Animal
public class Animal {
    private String color;
    private int numberOfLimbs;
    private String eyeColor;

    private List<Eye> eyes = new ArrayList<>(); //Aggregate composition
    private Breather breather;       //Composition

   // public Animal(){}

    public Animal(int limbsCount){
        numberOfLimbs = limbsCount;
    }

    public Animal(int numberOfLimbs, String animalColor){
        this.numberOfLimbs = numberOfLimbs;
        color = animalColor;
    }

    public List<Eye> getEyes() {
        return eyes;
    }

    public void setEyes(List<Eye> eyes) {
        this.eyes = eyes;
    }

    public Breather getBreather() {
        return breather;
    }

    public void setBreather(Nose imu) {
        this.breather = breather;
    }

   // public abstract void move();

    public void move(){
        System.out.println("I can't move...");
    }

    public void eat(){
        System.out.println("I am eating...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(int numberOfLimbs) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
