package com.tnsif.dayfive.multilevelinheritance;

import java.time.LocalDate;

public class Person {
    private String name;
    private long phone;
    private LocalDate dob;

    public Person(String name, long phone, LocalDate dob) {
        this.name = name;
        this.phone = phone;
        this.dob = dob;
    }

    public String getName() { return name; }
    public long getPhone() { return phone; }
    public LocalDate getDob() { return dob; }

    public void setName(String name) { this.name = name; }
    public void setPhone(long phone) { this.phone = phone; }
    public void setDob(LocalDate dob) { this.dob = dob; }

    @Override
    public String toString() {
        return "Person{name='" + name + "', phone=" + phone + ", dob=" + dob + "}";
    }
}
