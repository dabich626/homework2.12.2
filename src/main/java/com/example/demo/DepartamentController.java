package com.example.demo;

import com.example.demo.request.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/departament")
public class DepartamentController {

    private final DepartamentController service;

    public DepartamentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping("/max-salary")

        public Employee max (@RequestParam int departamentId ){

            return service.max(departmentId);

        }


}
