package com.employeeWithComposition;

import com.employee.SalaryEmployee;

public class SalaryCompositionModel extends CompensationModel {
    private double weeklySalary;

    public SalaryCompositionModel(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double calculateEarnings()
    {
        return weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
