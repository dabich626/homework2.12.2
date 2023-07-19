package com.example.demo;

public class Employee {

    private String name;
    private String secondName;


    public Employee(String name, String secondName) {

        this.name = name;
        this.secondName = secondName;


    }


    public String getName() {

        return this.name;
    }

    public String getSecondName() {

        return this.secondName;
    }


    public String toString() {

        return " имя: " + this.name + " отчество: " + this.secondName + " фамилия: ";
    }

}

