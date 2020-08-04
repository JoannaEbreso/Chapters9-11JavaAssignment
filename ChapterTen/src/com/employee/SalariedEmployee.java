package com.employee;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName,String lastName,String socialSecurityNumber,Date dateOfBirth,double weeklySalary){
        super(firstName,lastName,socialSecurityNumber,dateOfBirth);
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

    @Override
    public String toString(){
        return
                String.format("%s%n Employee Type: %s%n Earning: %.3f",super.toString(),getClass().getSimpleName(),getEarnings());
    }
}
