package com.example.buildingcompany.controller;

import com.example.buildingcompany.model.Department;
import com.example.buildingcompany.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/department/")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("all")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}
