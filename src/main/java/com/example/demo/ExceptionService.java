package com.example.demo;

public class ExceptionService {

    public static void findEmployeer(String emp) {

        if ( findEmployeer(emp); =null){

            throw new EmployeeNotFoundException("сотрудник не найден");
        }
    }

    public static void addEmployeer(String emp) {

        if (addEmployeer(emp) > employeerList.size) {

            throw new EmployeeStorageIsFullException("превышен лимит сотрудников")
        }

        public static void addEmployeer (String emp){

            if (addEmployeer(emp) = emp.contains(employeersList)) {

                throw new EmployeeAlreadyAddedException("Этот сотрудник уже добавлен")
            }
        }

    }


}
