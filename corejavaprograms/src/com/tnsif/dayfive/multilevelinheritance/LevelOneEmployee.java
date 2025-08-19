package com.tnsif.dayfive.multilevelinheritance;

import java.time.LocalDate;

public class LevelOneEmployee extends Employee {
    private String designation;

    public LevelOneEmployee(String name, long phone, LocalDate dob,
                            String employeeId, double salary, String designation) {
        super(name, phone, dob, employeeId, salary);
        this.designation = designation;
    }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    @Override
    public String toString() {
        return "LevelOneEmployee{designation='" + designation + "', " + super.toString() + "}";
    }
}
