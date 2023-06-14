package com.example.buildingcompany.service;

import com.example.buildingcompany.model.Tool;
import com.example.buildingcompany.repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolService {

    private final ToolRepository toolRepository;

    @Autowired
    public ToolService(ToolRepository toolRepository) {
        this.toolRepository = toolRepository;
    }

    public List<Tool> getAllTools() {
        return toolRepository.findAll();
    }
}
