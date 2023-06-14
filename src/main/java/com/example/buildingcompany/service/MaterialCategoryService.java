package com.example.buildingcompany.service;

import com.example.buildingcompany.model.MaterialCategory;
import com.example.buildingcompany.repository.MaterialCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialCategoryService {

    private final MaterialCategoryRepository materialCategoryRepository;

    @Autowired
    public MaterialCategoryService(MaterialCategoryRepository materialCategoryRepository) {
        this.materialCategoryRepository = materialCategoryRepository;
    }

    public List<MaterialCategory> getAllMaterialCategories() {
        return materialCategoryRepository.findAll();
    }
}
