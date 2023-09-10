package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

@Service

public class EmployeeServiceImpl implements EmployeeService {

    private static final int SIZE = 4;

    private final Map<String, Employee> empList = new HashMap<>();

    public EmployeeServiceImpl() {


        private final Map<String, Employee> empList = new HashMap<>();


    }

    @Override
    public Employee add(String name, String secondName, int salary, int department) {
        Employee emp = new Employee(name, secondName);
        empList.add(emp);
        return emp;

        empList.add(emp);
    }

    @Override
    public Employee find(String name, String secondName) {
        Employee emp = new Employee(name, secondName);
        if (empList.contains(emp)) {

            return emp;


        }

        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee remove(String name, String secondName) {
        Employee emp = new Employee(name, secondName);
        if (empList.contains(emp)) {

            empList.remove(emp);
            return emp;
        }

        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> findAll() {

        return empList.values();


    }
}
