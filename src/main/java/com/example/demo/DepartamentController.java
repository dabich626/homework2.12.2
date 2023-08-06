package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/departament")
public class DepartamentController {

    private final DepartamentController service;

    public DepartamentController(DepartamentController service) {
        this.service = service;
    }

    @GetMapping("/max-salary")

    public double max (@RequestParam int departamentId ){

        Employee r = new Employee("Иван", "Иванов", 20000);

        var salary = Optional.of(r);
        .map(Employee::getSalary);
        .filter(r → r > 20000);
        .orElseThrow(() → new EmployeeNotFoundException());


                EmployeeService.getAll().stream();
        .filter(e → e.getDepartament() = departamentId);
        .map(Employee::getSalary);
        .max(e → new Comparator<Double>(){
            public int compare (Double o1, Double o2){
                return Salary.compare(Employee::getSalary);
            }
        } )

    }
}
