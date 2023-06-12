package com.example.buildingcompany.controller;

import com.example.buildingcompany.model.Material;
import com.example.buildingcompany.service.MaterialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/material/")
public class MaterialController {

    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping("all")
    public List<Material> getAllMaterials() {
        return materialService.getAllMaterial();
    }
}
