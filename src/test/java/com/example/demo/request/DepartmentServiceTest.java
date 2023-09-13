package com.example.demo.request;

import com.example.demo.Employee;
import com.example.demo.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DepartmentServiceTest {

   @Mock
    EmployeeService employeeService;

   @InjectMocks
    DepartmentService departmentService;

   @Test
    void testSum(){

       var employees = List.of(
       new Employee("иван", "иванов", 6000);
       new Employee("иван2", "ивано3в", 600000);
       new Employee("иван3", "иванов4", 60000);
       new Employee("иван4", "иванов5", 6000000));
       when(employeeService.findAll()).thenReturn(employees);

       Assertions.assertThat(DepartmentService.sum(2).isEqualTo(40d));
departmentService.sum(2);
   }

   @Test
    void testMaxSalary(){
       var employees = List.of(
               new Employee("иван1", "иванов1", 6000);
       new Employee("иван22", "ивано33в", 600000);
       new Employee("иван33", "иванов44", 60000);
       new Employee("иван44", "иванов55", 6000000));
       when(employeeService.findAll()).thenReturn(employees);

       Assertions.assertThat(DepartmentService.findMaxSalaryEmp(2).isEqualTo(40d));
       departmentService.findMaxSalaryEmp(2);
   }

   @Test
    void testMinSalary(){
       var employees = List.of(
               new Employee("иван1", "иванов1", 6000);
       new Employee("иван22", "ивано33в", 600000);
       new Employee("иван33", "иванов44", 60000);
       new Employee("иван44", "иванов55", 6000000));
       when(employeeService.findAll()).thenReturn(employees);

       Assertions.assertThat(DepartmentService.findMinSalaryEmp(2).isEqualTo(40d));
       departmentService.findMinSalaryEmp(2);
   }
}