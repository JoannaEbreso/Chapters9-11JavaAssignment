package com.employee;

public class HourlyEmployee extends Employee {
    private int numOfHoursWorked;
    private double wagePerHour;
    private double earnings;

    public HourlyEmployee(String firstName,String lastName, String socialSecurityNumber,int numOfHoursWorked, double wagePerHour){
        super(firstName,lastName,socialSecurityNumber);

        this.numOfHoursWorked = numOfHoursWorked;
        this.wagePerHour = wagePerHour;
    }

    @Override
    public double getEarnings(){
        if(numOfHoursWorked <= 40){
            earnings = wagePerHour * numOfHoursWorked;
        }
        else {
            earnings = (40 * wagePerHour) + ((numOfHoursWorked - 40) * wagePerHour * 1.5);
        }
        return earnings;
    }

    public int getNumOfHoursWorked() {
        return numOfHoursWorked;
    }

    public void setNumOfHoursWorked(int numOfHoursWorked) {
        this.numOfHoursWorked = numOfHoursWorked;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}
