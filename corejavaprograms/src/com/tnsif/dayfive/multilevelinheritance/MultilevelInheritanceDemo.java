package com.tnsif.dayfive.multilevelinheritance;

import java.time.LocalDate;

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Atharv", 78787676761L, LocalDate.of(2000, 12, 5));
        System.out.println(p1);

        p1 = new Employee("Pranav", 80808070701L, LocalDate.of(1995, 5, 7), "E101", 55000.0);
        System.out.println(p1);

        p1 = new LevelOneEmployee("Madhur", 98808072271L, LocalDate.of(1988, 1, 15),
                                  "E201", 75000.0, "Senior Developer");
        System.out.println(p1);
    }
}
