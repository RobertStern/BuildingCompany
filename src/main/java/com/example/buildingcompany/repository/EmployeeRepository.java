package com.example.buildingcompany.repository;

import com.example.buildingcompany.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
