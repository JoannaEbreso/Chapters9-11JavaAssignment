package com.employee;

public class SalaryEmployee  extends Employee{
    private double weeklySalary;

    public SalaryEmployee(String firstName,String lastName, String socialSecurityNumber, double weeklySalary){
    super(firstName,lastName,socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getEarnings(){
        return weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
