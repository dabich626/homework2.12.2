package com.example.demo.request;

import com.example.demo.Employee;
import com.example.demo.EmployeeNotFoundException;
import com.example.demo.EmployeeService;

import java.util.List;
import java.util.Map;

public class DepartmentService {

    private EmployeeService employeeService;

    public DepartmentService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee findMaxSalaryEmp(int department) {

        return employeeService.findAll().stream()

                .filter(employee -> employee.getDepartment() == department)

                .min(Comparator.comparingDouble(employee -> employee.getSalary()))

                .orElseThrow(() -> new EmployeeNotFoundException("Нет сотрудников в отделе " + department));

    }

    public Employee findMinSalaryEmp(int department) {

        return employeeService.findAll().stream()

                .filter(employee -> employee.getDepartment() == department)

                .max(Comparator.comparingDouble(employee -> employee.getSalary()))

                .orElseThrow(() -> new EmployeeNotFoundException("Нет сотрудников в отделе " + department));

    }

    public Map<Integer, List<Employee>> getAllGroupingByDepartment() {

        return employeeService.findAll().stream()

                .collect(Collectors.groupingBy(employee -> employee.getDepartment()));

    }

    public double sum (int deptId){

        return employeeService.getAll()

                .filter(employee -> employee.getDepartment() == deptId)

                .map(Comparator.comparingDouble(employee -> employee.getSalary()))

                .mapToDouble(employee -> employee)

                ,sum();

    }
}
