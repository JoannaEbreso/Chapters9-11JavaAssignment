package com.employeeWithComposition;

public class CommissionEmployeeCompensationModel extends CompensationModel{
    private double commissionRate;
    private double grossSales;

    public CommissionEmployeeCompensationModel(double commissionRate, double grossSales){
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    @Override
    public double calculateEarnings(){
        return commissionRate * grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
}
