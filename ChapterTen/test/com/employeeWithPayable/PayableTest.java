package com.employeeWithPayable;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkPayableTestInterface(){
        Payable[] payableObjects = new Payable[6];
        payableObjects[0] = new Invoice("1234","engine",20,10.00);
        payableObjects[1] = new Invoice("5678","seat",10,50.00);
        payableObjects[2] = new SalariedEmployee("Cindy","Sing","2345789",10000.00);
        payableObjects[3] = new HourlyEmployee("Drew","Clark","5635908",10,50.0);
        payableObjects[4] = new CommissionEmployee("Idara","Eko","67543290",1.5,500.0);
        payableObjects[5] = new BasePlusCommissionEmployee("Rejoice","Philip","56273902",1.5,300.0,400.0);

        for(Payable object: payableObjects){
            System.out.println(object.toString());
            System.out.println();
        }

        for(int i = 0; i<payableObjects.length; i++){
            if(payableObjects[i] instanceof BasePlusCommissionEmployee){
               double increasedBaseSalary=((BasePlusCommissionEmployee) payableObjects[i]).getBaseSalary() + 10.00;
               ((BasePlusCommissionEmployee) payableObjects[i]).setBaseSalary(increasedBaseSalary);
               System.out.printf("Payable Object %d%n Payment Amount: %.2f",i+1,payableObjects[i].getPaymentAmount());
            }
            else{
                System.out.printf("Payable Object %d%n Payment Amount: %.2f%n",i+1,payableObjects[i].getPaymentAmount());
                System.out.println();
            }
        }
    }
}