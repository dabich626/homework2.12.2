package com.example.demo;

public class Employee {

    private String name;
    private String secondName;

    private double salary;

    private int department;


    public Employee(String name, String secondName, double salary) {

        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.department = department;



    }

    public int getDepartment() {
        return department;
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

