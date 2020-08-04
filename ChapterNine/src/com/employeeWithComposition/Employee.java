package com.employeeWithComposition;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private CompensationModel comp;

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

    public CompensationModel getComp() {
        return comp;
    }

    public void setComp(CompensationModel comp) {
        this.comp = comp;
    }
}
