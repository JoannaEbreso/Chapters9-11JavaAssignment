package com.exceptionClasses;

public class ExceptionHierarchyTrial {

    private int num1;
    private int num2;

    public ExceptionHierarchyTrial(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int trialMethod() throws ExceptionA,ExceptionB,ExceptionC{
        return num1 / num2;
    }
}
