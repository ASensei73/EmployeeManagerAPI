package com.arombustamante.EmployeeManagerAPI.Service;

import com.arombustamante.EmployeeManagerAPI.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> employeeList();

    Employee employeeSave(Employee employee);

    Employee employeeUpdate(Long id, Employee employee);

    void employeeDelete(Long id);

    Employee employeeFindById(Long id);

}
