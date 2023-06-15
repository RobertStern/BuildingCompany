package com.example.buildingcompany.controller;

import com.example.buildingcompany.dto.MaterialDto;
import com.example.buildingcompany.model.Material;
import com.example.buildingcompany.service.MaterialService;
import lombok.NonNull;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/material/")
public class MaterialController {

    @Autowired
    private ModelMapper modelMapper;
    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping("all")
    public List<Material> getAllMaterials() {
        return materialService.getAllMaterial();
    }

    @GetMapping("{id}")
    public ResponseEntity<MaterialDto> getMaterialById(@PathVariable @NonNull Long id) {
        Material material = materialService.getMaterialById(id);
        MaterialDto materialDto = modelMapper.map(material, MaterialDto.class);

        return ResponseEntity.ok(materialDto);
    }

    @PostMapping("{id}")
    public ResponseEntity<MaterialDto> updateMaterial(@PathVariable @NonNull Long id, @RequestParam("amount") Integer amount) {
        Material material = materialService.uploadMaterial(id,amount);
        MaterialDto materialDto = modelMapper.map(material, MaterialDto.class);
        return ResponseEntity.ok(materialDto);
    }
}
