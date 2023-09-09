package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    EmployeeService employeeService = new EmployeeService();


    @Test
    void testAddEmp() {

        employeeService.add("test", "тест");

        var AllEpm = employeeService.findAll();

        assertEquals(1, allEmp.size());

        var employee = allEmp.iterator().next();

        assertEquals("test", employee.getName());
    }

    @Test
    void find() {
    }

    @Test
    void remove() {
    }

    @Test
    void findAll() {
    }
}