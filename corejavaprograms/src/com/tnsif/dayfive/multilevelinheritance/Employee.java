package com.tnsif.dayfive.multilevelinheritance;

import java.time.LocalDate;

public class Employee extends Person {
    private String employeeId;
    private double salary;

    public Employee(String name, long phone, LocalDate dob, String employeeId, double salary) {
        super(name, phone, dob);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }

    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee{employeeId='" + employeeId + "', salary=" + salary + ", " + super.toString() + "}";
    }
}
