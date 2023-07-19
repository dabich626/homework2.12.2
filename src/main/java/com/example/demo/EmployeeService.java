package com.example.demo;

import java.util.List;

public class EmployeeService {

    String emp1;

    String emp2;

    String emp3;

    String emp4;

    String newEmp;

    public EmployeeService(String emp1, String emp2, String emp3, String emp4, String newEmp, String employeeList) {
        this.emp1 = emp1;
        this.emp2 = emp2;
        this.emp3 = emp3;
        this.emp4 = emp4;
        this.newEmp = newEmp;
    }

    public String getEmp1() {
        return emp1;
    }

    public String getEmp2() {
        return emp2;
    }

    public String getEmp3() {
        return emp3;
    }

    public String getEmp4() {
        return emp4;
    }

    public String getNewEmp() {
        return newEmp;
    }

    List<String> employeeList = List.of(emp1, emp2, emp3, emp4);

    public void addEmployeer() {

        employeeList = List.add(getNewEmp());


        if (addEmployeer() > employeerList.size) {

            throw new EmployeeStorageIsFullException("превышен лимит сотрудников")
        } if (addEmployeer(emp) = emp.contains(employeersList)) {

            throw new EmployeeAlreadyAddedException("Этот сотрудник уже добавлен")
        }

    }

    public void deleteEmployeer() {

        employeeList = List.set[newEmp, null];

        if ( deleteEmployeer(newEmp); =null){

            throw new EmployeeNotFoundException("сотрудник не найден");
        }

    }

    public void findEmployeer() {

        employeeList.get(findEmployeer();)

        if ( findEmployeer(emp); =null){

            throw new EmployeeNotFoundException("сотрудник не найден");
        }
    }
}

