package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service

public class EmployeeServiceImpl implements EmployeeService {

private final List<Employee> empList;
    public EmployeeServiceImpl() {
        this.empList = new ArrayList<>();
    }


    @Override
    public Employee add(String name, String secondName) {
        Employee emp = new Employee(name, secondName);
        empList.add(emp);
        return emp;
    }

    @Override
    public Employee find(String name, String secondName) {
        Employee emp = new Employee(name, secondName);
        if(empList.contains(emp)){

            return emp;
        }

        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee remove(String name, String secondName) {
        Employee emp = new Employee(name, secondName);
        if(empList.contains(emp)){

            empList.remove(emp);
            return emp;
        }

        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> findAll() {
        return new ArList<>(empList);
    }
}
