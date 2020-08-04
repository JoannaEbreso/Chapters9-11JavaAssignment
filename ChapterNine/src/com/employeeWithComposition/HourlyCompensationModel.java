package com.employeeWithComposition;

public class HourlyCompensationModel extends CompensationModel {
    private int numOfHoursWorked;
    private double wagePerHour;
    private double earnings;

    public HourlyCompensationModel(int numOfHoursWorked,double wagePerHour){
        this.numOfHoursWorked = numOfHoursWorked;
        this.wagePerHour = wagePerHour;
    }

    @Override
    public double calculateEarnings(){
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

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}
