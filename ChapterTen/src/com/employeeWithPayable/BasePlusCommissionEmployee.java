package com.employeeWithPayable;

import com.employee.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double commissionRate, double grossSales, double baseSalary){
        super(firstName,lastName,socialSecurityNumber,commissionRate, grossSales);

        this.baseSalary = baseSalary;
    }

    @Override
    public double getPaymentAmount(){
        return super.getPaymentAmount() + baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString(){
        return String.format("%s",super.toString());
    }
}
