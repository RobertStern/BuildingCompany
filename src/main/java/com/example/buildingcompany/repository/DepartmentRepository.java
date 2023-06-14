package com.example.buildingcompany.repository;

import com.example.buildingcompany.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
