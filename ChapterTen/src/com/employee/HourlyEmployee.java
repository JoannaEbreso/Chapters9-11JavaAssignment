package com.employee;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    private double earnings;

    public HourlyEmployee(String firstName,String secondName,String socialSecurityNumber,Date dateOfBirth,int hoursWorked, double hourlyRate){
        super(firstName,secondName,socialSecurityNumber,dateOfBirth);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
//    public HourlyEmployee(Employee employee, int hoursWorked, double hourlyRate){
//        super(employee.getFirstName(),employee.getLastName(),employee.getSocialSecurityNumber(),employee.getBirthDate());
//        this.hoursWorked = hoursWorked;
//        this.hourlyRate = hourlyRate;
//    }

    @Override
    public double getEarnings(){
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
        return String.format("%s%n Employee Type: %s%n Earning: %.3f",super.toString(),getClass().getSimpleName(),getEarnings());
    }
}
