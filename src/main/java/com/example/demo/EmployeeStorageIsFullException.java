package com.example.demo;

public class EmployeeStorageIsFullException extends Exception {

    public EmployeeStorageIsFullException(String massege) {

        super(massege);
    }
}
