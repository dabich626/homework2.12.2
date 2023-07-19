package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController extends EmployeeService {
    public EmployeeController(String emp1, String emp2, String emp3, String emp4, String newEmp, String employeeList) {
        super(emp1, emp2, emp3, emp4, newEmp, employeeList);

        @GetMapping(path =/employee/add?firstName = Ivan & lastName=Ivanov) {
            return EmployeeService.
        }

    }
}
