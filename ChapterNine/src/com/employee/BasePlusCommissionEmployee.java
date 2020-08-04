package com.employee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName,String lastName, String socialSecurityNumber,double commissionRate, double grossSales,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,commissionRate, grossSales);

        this.baseSalary = baseSalary;
    }

    @Override
    public double getEarnings(){
        return super.getEarnings() + baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
