package com.employee;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName,String lastName, String socialSecurityNumber,Date dateOfBirth,double commissionRate, double grossSales,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,dateOfBirth,commissionRate, grossSales);

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

    @Override
    public String toString(){
        return String.format("%s%n Employee Type: %s%n Earning: %.3f",super.toString(),getClass().getSimpleName(),getEarnings());
    }
}
