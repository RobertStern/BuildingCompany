package com.example.buildingcompany.service;

import com.example.buildingcompany.model.Material;
import com.example.buildingcompany.repository.MaterialRepository;
import com.example.buildingcompany.utilities.OpenTextFileOperation;
import com.example.buildingcompany.utilities.SaveTextFileOperation;
import com.example.buildingcompany.utilities.TextFile;
import com.example.buildingcompany.utilities.TextFileOperationExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    private final MaterialObserver materialObserver;

    private final TextFileOperationExecutor textFileOperationExecutor
            = new TextFileOperationExecutor();

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

    public String readFile(String name) {
        return textFileOperationExecutor.executeOperation(
                new OpenTextFileOperation(new TextFile(name +".txt")));
    }

    public String saveFile(String name) {
        return textFileOperationExecutor.executeOperation(
                new SaveTextFileOperation(new TextFile(name + ".txt")));
    }
}
