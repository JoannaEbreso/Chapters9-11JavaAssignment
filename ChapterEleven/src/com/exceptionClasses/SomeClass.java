package com.exceptionClasses;

public class SomeClass {
    private String name;
    private int age;

    public SomeClass(String name,int age) throws Exception {
        if(age<1){
//            throw new Exception("ERROR");
            throw new Exception("Your Age can't be less than 1");
        }
        this.name = name;
        this.age = age;
    }

//    public void processPerson(String name,int age) throws Exception{
//
////        try{
////            this.name = name;
////        }
//    }
}
