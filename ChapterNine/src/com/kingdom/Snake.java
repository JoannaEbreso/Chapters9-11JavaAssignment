package com.kingdom;

public class Snake extends Reptile {
    public Snake(int limbCount){
        super(limbCount);
    }
    @Override
    public void move(){
        System.out.println("I'm crawling...");
    }
}
