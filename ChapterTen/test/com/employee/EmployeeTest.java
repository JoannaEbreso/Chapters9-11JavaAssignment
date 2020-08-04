package com.employee;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateEarningsForEmployees(){
        Date payRollDate = new Date(30,1,2004);
        Payroll payrollForJanuary = new Payroll(payRollDate);
        Date secretaryBirthDate = new Date(11,1,2004);
        Employee secretary = new SalariedEmployee("Lydia","Ebreso","34567789", secretaryBirthDate,12500);
        payrollForJanuary.setEmployees(secretary);


      //  assertEquals(12500.00,cashier1.getEarnings());

        Date cashierBirthDate = new Date(15,5,1992);
        Employee cashier = new HourlyEmployee("Vicky","Sand","45637829", cashierBirthDate,5,500.00);
        payrollForJanuary.setEmployees(cashier);
      //  assertEquals(65000.00,cashier2.getEarnings());

        Date contractorBirthDate = new Date(30,1,1996);
        Employee contractor = new CommissionEmployee("Vicky","Sand","45637829", contractorBirthDate,100,500.00);
        payrollForJanuary.setEmployees(contractor);

        Date marketerBirthDate = new Date(23,5,1996);
        Employee marketer = new BasePlusCommissionEmployee("Vicky","Sand","45637829", marketerBirthDate,100,500.00,50.00);
        payrollForJanuary.setEmployees(marketer);

        Date salesOfficerBirthDate = new Date(30,10,1992);
        Employee salesOfficer = new PieceWorker("Vicky","Sand","45637829", salesOfficerBirthDate,40,400);
        payrollForJanuary.setEmployees(salesOfficer);

        for(int i = 0; i<payrollForJanuary.getEmployees().size(); i++){
//        calculate payroll => we would get the earning for each employee
            double earnings = payrollForJanuary.getEmployees().get(i).getEarnings();
            //we would add an extraSalary of 100.00 if employee birth month is equal to payroll month
            if(payrollForJanuary.getEmployees().get(i).getBirthDate().getMonth() == payRollDate.getMonth()){
                double extraSalary = 100.00;
                System.out.printf("birthDayBonusSalary: %.2f%n", (earnings + extraSalary));
            }
            else {
                  System.out.println("Salary: " + earnings);
            }
//              System.out.println(payrollForJanuary.getEmployees().get(i).getClass().getSimpleName());
//            System.out.println(payrollForJanuary.getEmployees().get(i));
        }
    }

    @Test
    void printStringRepresentationsOfObjectsAndTheirEarnings(){
        Date payRollDate = new Date(30,1,2004);
        Payroll payrollForJanuary = new Payroll(payRollDate);
        Date secretaryBirthDate = new Date(11,1,2004);
        Employee secretary = new SalariedEmployee("Lydia","Ebreso","34567789", secretaryBirthDate,12500);
        payrollForJanuary.setEmployees(secretary);

        Date cashierBirthDate = new Date(15,5,1992);
        Employee cashier = new HourlyEmployee("Vicky","Sand","45637829", cashierBirthDate,5,500.00);
        payrollForJanuary.setEmployees(cashier);

        Date contractorBirthDate = new Date(30,1,1996);
        Employee contractor = new CommissionEmployee("Vicky","Sand","45637829", contractorBirthDate,100,500.00);
        payrollForJanuary.setEmployees(contractor);

        Date marketerBirthDate = new Date(23,5,1996);
        Employee marketer = new BasePlusCommissionEmployee("Vicky","Sand","45637829", marketerBirthDate,100,500.00,50.00);
        payrollForJanuary.setEmployees(marketer);

        Date salesOfficerBirthDate = new Date(30,10,1992);
        Employee salesOfficer = new PieceWorker("Vicky","Sand","45637829", salesOfficerBirthDate,40,400);
        payrollForJanuary.setEmployees(salesOfficer);

        for(int i = 0; i<payrollForJanuary.getEmployees().size(); i++){
            System.out.println(payrollForJanuary.getEmployees().get(i).toString());
            System.out.println();
        }
    }

    @Test
    void usePayableInterface(){
        Payable[] payableObjects = new Payable[4];

        Date secretaryBirthDate = new Date(11,1,2004);
        payableObjects[0] = new SalariedEmployee("Cindy","Sing","2345789",secretaryBirthDate,10000.00);
        Date cashierBirthDate = new Date(15,5,1992);
        payableObjects[1] = new HourlyEmployee("Drew","Clark","5635908",cashierBirthDate,10,50.0);
        Date contractorBirthDate = new Date(30,1,1996);
        payableObjects[2] = new CommissionEmployee("Idara","Eko","67543290",contractorBirthDate,1.5,500.0);
        Date marketerBirthDate = new Date(23,5,1996);
        payableObjects[3] = new BasePlusCommissionEmployee("Rejoice","Philip","56273902", marketerBirthDate,1.5,300.0,400.0);

        for(Payable object: payableObjects){
            System.out.println(object.toString());
            System.out.println();
        }

        for(int i = 0; i<payableObjects.length; i++){
            if(payableObjects[i] instanceof com.employeeWithPayable.BasePlusCommissionEmployee){
                double increasedBaseSalary=((com.employeeWithPayable.BasePlusCommissionEmployee) payableObjects[i]).getBaseSalary() + 10.00;
                ((com.employeeWithPayable.BasePlusCommissionEmployee) payableObjects[i]).setBaseSalary(increasedBaseSalary);
                System.out.printf("Payable Object %d%n Payment Amount: %.2f",i+1,payableObjects[i].getPaymentAmount());
            }
            else{
                System.out.printf("Payable Object %d%n Payment Amount: %.2f%n",i+1,payableObjects[i].getPaymentAmount());
                System.out.println();
            }
        }
    }
}