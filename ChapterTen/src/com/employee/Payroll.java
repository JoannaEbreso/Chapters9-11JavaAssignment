package com.employee;

import java.util.ArrayList;
import java.util.List;

public class Payroll {
    private List<Employee> employees = new ArrayList<>();
    private Date payrollDate;

    public Payroll(Date dateOnPayroll){
        payrollDate = dateOnPayroll;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employee) {
        employees.add(employee);
    }

    public Date getDate() {
        return payrollDate;
    }

    public void setDate(Date dateOnPayroll) {
        payrollDate = dateOnPayroll;
    }
}
