package com.kingdom;

public class Frog extends Animal {
    public Frog(){
        super(4);
    }
    @Override
    public void move(){
        System.out.println("I am hopping...");
    }
}
