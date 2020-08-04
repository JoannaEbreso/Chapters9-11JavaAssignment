package com.employee;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName,String lastName, String socialSecurityNumber,Date dateOfBirth,double commissionRate,double grossSales){
        super(firstName,lastName,socialSecurityNumber,dateOfBirth);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    @Override
    public double getEarnings(){
        return commissionRate * grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString(){
        return String.format("%s%n Employee Type: %s%n Earning: %.3f",super.toString(),getClass().getSimpleName(),getEarnings());
    }
}
