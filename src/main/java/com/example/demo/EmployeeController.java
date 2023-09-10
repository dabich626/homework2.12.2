package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(/employee/)
public class EmployeeController {

    private final EmployeeService service;


     public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping(path =/employee/add?firstName = Ivan & lastName=Ivanov) {
        public Employee addEmployee (@RequestParam String name, @RequestParam String secondName, @RequestParam int salary, @RequestParam int department){
            return service.add("Ivan", "Ivanov", 20000, 2);
        }
    }

    @GetMapping(path =/employee/remove?firstName = Ivan & lastName=Ivanov) {
        public Employee removeEmployee (@RequestParam String name, @RequestParam String secondName){
            return service.remove("Ivan", "Ivanov");
        }
    }

    @GetMapping(path =/employee/find?firstName = Ivan & lastName=Ivanov) {
        public Employee findEmployee (@RequestParam String name, @RequestParam String secondName){
            return service.find("Ivan", "Ivanov");


        }
    }

    @GetMapping
    public Collection<Employee> findAll() {
        return service.findAll();
    }
}



