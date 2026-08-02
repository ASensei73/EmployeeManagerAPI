package com.arombustamante.EmployeeManagerAPI.Service;

import com.arombustamante.EmployeeManagerAPI.Entity.Employee;
import com.arombustamante.EmployeeManagerAPI.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> employeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee employeeSave(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee employeeUpdate(Long id, Employee employee) {
        Employee employeeExist = employeeRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Don´t existing employee with id: " + id)
        );

        employeeExist.setId(employee.getId());
        employeeExist.setName(employee.getName());
        employeeExist.setLastName(employee.getLastName());
        employeeExist.setEmail(employee.getEmail());
        employeeExist.setRol(employee.getRol());

        return employeeRepository.save(employeeExist);

    }

    @Override
    public void employeeDelete(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Don´t existing employee with id: " + id)
        );
        employeeRepository.delete(employee);

    }
}
