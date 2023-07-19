package com.example.demo;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String name, String secondName);

    Employee find(String name, String secondName)

    Employee remove(String name, String secondName)

    Collection<Employee> findAll();
}
