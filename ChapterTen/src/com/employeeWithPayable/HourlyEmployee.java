package com.employeeWithPayable;

import com.employee.Date;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    private double earnings;

    public HourlyEmployee(String firstName, String secondName, String socialSecurityNumber, int hoursWorked, double hourlyRate){
        super(firstName,secondName,socialSecurityNumber);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPaymentAmount(){
        if(hoursWorked <= 40){
            earnings = hourlyRate * hoursWorked;
        }
        else {
            earnings = (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
        }
        return earnings;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    @Override
    public String toString(){
        return String.format("%s%n Employee Type: %s",super.toString(),getClass().getSimpleName());
    }
}
