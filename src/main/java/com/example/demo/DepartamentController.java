package com.example.demo;

import com.example.demo.request.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departament")
public class DepartamentController {

    private final DepartamentService service;

    public DepartamentController(DepartmentService service) {
        this.service = service;
    }


    @GetMapping("/{id}/sum-salary")
    public double sumByDept(@PathVariable int id) {
        return   service.sum(id);
    }

    @GetMapping("/{id}/max/salary")

    public Employee max(@RequestParam int departamentId) {


        return service.findMaxSalaryEmp(departamentId);

    }

    @GetMapping("/{id}/min/salary")

    public Employee min(@RequestParam int departamentId) {


        return service.findMinSalaryEmp(departamentId);

    }

    @GetMapping("/all")

    public Map<Integer, List<Employee>> min() {

        return service.getAllGroupingByDepartment();

    }


}
