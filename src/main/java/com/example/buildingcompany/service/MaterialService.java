package com.example.buildingcompany.service;

import com.example.buildingcompany.model.Material;
import com.example.buildingcompany.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    @Autowired
    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public List<Material> getAllMaterial() {
        return materialRepository.findAll();
    }
}
