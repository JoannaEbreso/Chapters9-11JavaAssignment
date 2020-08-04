package com.employee;

public abstract class Employee implements Payable{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;

    public Employee(String firstName,String lastName,String socialSecurityNumber,Date dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        birthDate = dateOfBirth;
    }

    public abstract double getEarnings();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public double getPaymentAmount(){
        return getEarnings();
    }

    @Override
    public String toString(){
        return String.format("Name: %s %s%n SSN: %s%n BirthDate: %s",getFirstName(),getLastName(),getSocialSecurityNumber(),getBirthDate());
    }
}
