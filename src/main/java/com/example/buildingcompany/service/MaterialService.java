package com.example.buildingcompany.service;

import com.example.buildingcompany.model.Material;
import com.example.buildingcompany.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    private final MaterialObserver materialObserver;

    @Autowired
    public MaterialService(MaterialRepository materialRepository, MaterialObserver materialObserver) {
        this.materialRepository = materialRepository;
        this.materialObserver = materialObserver;
    }

    public List<Material> getAllMaterial() {
        return materialRepository.findAll();
    }

    public Material getMaterialById(Long id) {
        Optional<Material> material = materialRepository.findById(id);
        return material.orElse(null); //TODO Spravit null objekt vracanie
    }

    public Material uploadMaterial(Long materialId, Integer amount) {
        Material material = materialRepository.findById(materialId).get();
        material.setAmount(amount);
        Material result = materialRepository.save(material);
        materialObserver.checkStateOfMaterial();
        return result;
    }
}
