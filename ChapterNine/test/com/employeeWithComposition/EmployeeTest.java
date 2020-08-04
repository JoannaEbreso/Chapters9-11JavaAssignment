package com.employeeWithComposition;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEmployee(){
        Employee gateman = new Employee();
        gateman.setFirstName("Sule");
        gateman.setLastName("Muma");
        gateman.setSocialSecurityNumber("23456689");
        CompensationModel suleComp = new SalaryCompositionModel(10000);
        gateman.setComp(suleComp);

        assertEquals(10000,gateman.getComp().calculateEarnings());

        Employee cook = new Employee();
        cook.setFirstName("Blessing");
        cook.setLastName("Adeola");
        cook.setSocialSecurityNumber("56738920");
        CompensationModel blessComp = new HourlyCompensationModel(5,20.00);
        cook.setComp(blessComp);

        assertEquals(100.00,cook.getComp().calculateEarnings());



    }
}