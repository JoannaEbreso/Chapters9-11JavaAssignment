package com.exceptionClasses;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHierarchyTrialTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkExceptionHandling(){
        ExceptionHierarchyTrial newTrial = new ExceptionHierarchyTrial(15,3);
        try{
           newTrial.trialMethod();
        }
        catch(ExceptionA e){
            System.out.println("ExceptionC");
//            System.out.println(e.getMessage());
        }



    }

    @Test
    void checkExceptionHandlingForSubclasses(){
        ExceptionHierarchyTrial newTrial = new ExceptionHierarchyTrial(2,3);
        try{
            newTrial.trialMethod();
        }
        catch(ExceptionC e){

        }
        catch(ExceptionB e){

        }
        catch(ExceptionA exception){

        }
    }

    @Test
    void checkExceptionHandlingWithConstructor() throws Exception {
        try {
            SomeClass person = new SomeClass("Lily", -5);
        }
        catch (Exception exception){
            System.err.println(exception.getMessage());
        }
        System.out.println("Hello");
    }
}
