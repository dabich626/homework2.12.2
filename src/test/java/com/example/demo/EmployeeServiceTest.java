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
        assertEquals("тест", getSecondName());
    }

    @Test
    void testAddWhenEmpListAreFull() {
        employeeService.add("иван", "иванов");
        employeeService.add("петр", "петров");
        employeeService.add("александр", "александров");
        employeeService.add("гарри", "поттер");
        assertThrows(EmployeeStorageIsFullException.class, () -> employeeService.add("рон", "уизли"));

    }

    @Test

    void testAddEmpWhoAlreadyInList(){
employeeService.add("иван", "иванов");
assertThrows(EmployeeAlreadyAddedException.class, () -> employeeService.add("иван", "иванов"));

    }

    @Test
    void testRemove() {
        employeeService.add("иван", "иванов");
        assertEquals("иван", employeeService.findAll().size());

        employeeService.remove("иван", "иванов");

        assertThrows(EmployeeNotFoundException.class () -> employeeService.remove("ваня", "авлександров"));

    }

    @Test
    void findEmp() {
        employeeService.add("иван", "иванов");
        employeeService.find("иван", "иванов");
        assertEquals("иван", employeeService.getName());
        assertEquals("иванов", employeeService.getSecondName());

    }

    @Test
    void testNotFoundEmp(){
        employeeService.add("иван", "иванов");
        employeeService.find("александр", "александр");
        assertEquals("александр", employeeService.getName());
        assertEquals("иванович", employeeService.getSecondName());
        assertThrows(EmployeeNotFoundException.class () -> employeeService.find("александр", "иванович"));

    }
}