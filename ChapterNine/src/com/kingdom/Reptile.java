package com.kingdom;

public class Reptile extends Animal{
    public Reptile(int limbCount){
        super(limbCount);
    }

    @Override
    public void move(){
        System.out.println("I'm slithering...");
    }
}
