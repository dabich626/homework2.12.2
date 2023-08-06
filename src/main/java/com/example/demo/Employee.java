package com.example.demo;

public class Employee {

    private String name;
    private String secondName;

    private double salary;


    public Employee(String name, String secondName, double salary) {

        this.name = name;
        this.secondName = secondName;
        this.salary = salary;


    }


    public String getName() {

        return this.name;
    }

    public String getSecondName() {

        return this.secondName;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {

        return " имя: " + this.name + " отчество: " + this.secondName + " фамилия: ";
    }

}

