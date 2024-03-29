package com.example.buildingcompany.controller;

import com.example.buildingcompany.model.Employee;
import com.example.buildingcompany.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/employee/")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("all")
    public List<Employee> getAllDepartments() {
        return employeeService.getAllEmployees();
    }
}
