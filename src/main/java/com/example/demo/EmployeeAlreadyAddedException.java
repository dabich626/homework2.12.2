package com.example.demo;

public class EmployeeAlreadyAddedException extends RuntimeException {

    public EmployeeAlreadyAddedException(String messege) {

        super(messege);

    }
}
