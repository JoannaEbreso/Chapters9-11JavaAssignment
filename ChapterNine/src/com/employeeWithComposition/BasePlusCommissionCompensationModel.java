package com.employeeWithComposition;

public class BasePlusCommissionCompensationModel extends CommissionEmployeeCompensationModel {
    private double baseSalary;

    public BasePlusCommissionCompensationModel(double commissionRate, double grossEarnings, double baseSalary){
        super(commissionRate,grossEarnings);
    }

    @Override
    public double calculateEarnings()
    {
        return super.calculateEarnings() + baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
