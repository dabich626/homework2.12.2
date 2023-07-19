package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        private Employee[] employees = new Employee[10];


        employees[0] = new Employee("Иван", "Иванович", "Иванов", 20000, 1);


        employees[1] = new Employee("Петр", "Петрович", "Петров", 350000, 3);


        employees[2] = new Employee("Александр", "Александрович", "Александров", 25000, 4);

        printAll();


    }

    static void printAll() {

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}


