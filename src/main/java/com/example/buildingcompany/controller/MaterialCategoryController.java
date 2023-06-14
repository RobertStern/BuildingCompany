package com.example.buildingcompany.controller;

import com.example.buildingcompany.model.MaterialCategory;
import com.example.buildingcompany.service.MaterialCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/materialCategory/")
public class MaterialCategoryController {

    private final MaterialCategoryService materialCategoryService;

    public MaterialCategoryController(MaterialCategoryService materialCategoryService) {
        this.materialCategoryService = materialCategoryService;
    }

    @GetMapping("all")
    public List<MaterialCategory> getAllMaterialCategories() {
        return materialCategoryService.getAllMaterialCategories();
    }
}
