package com.arombustamante.EmployeeManagerAPI.Controller;

import com.arombustamante.EmployeeManagerAPI.Entity.Employee;
import com.arombustamante.EmployeeManagerAPI.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Project api rest completed

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.employeeList();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) {
        return employeeService.employeeFindById(id);
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return employeeService.employeeSave(employee);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.employeeUpdate(id, employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeeService.employeeDelete(id);
    }

}
