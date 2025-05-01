package org.example.Models;

import java.time.LocalDate;

public class Person {

    //id;name;gender;BirtDate;Division;Salary
    private final int id;
    private final String name;
    private final String gender;
    private final LocalDate birtDate;
    private final Division division;
    private final double salary;

    public Person(int id, String name, String gender, LocalDate birthDate, Division division, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birtDate = birthDate;
        this.division = division;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birtDate;
    }

    public Division getDivision() {
        return division;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Person{" + "id = " + id + ", name = '" + name + '\'' + ", gender = " + gender + ", division = " + division.toString() + ", salary = " + salary +
                ", birthDate = " + birtDate + '}';
    }
}