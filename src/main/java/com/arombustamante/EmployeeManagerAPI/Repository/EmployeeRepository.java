package com.arombustamante.EmployeeManagerAPI.Repository;

import com.arombustamante.EmployeeManagerAPI.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
