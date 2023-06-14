package com.example.buildingcompany.controller;

import com.example.buildingcompany.model.Tool;
import com.example.buildingcompany.service.ToolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/tool/")
public class ToolController {

    private final ToolService toolService;

    public ToolController(ToolService toolService) {
        this.toolService = toolService;
    }
    @GetMapping("all")
    public List<Tool> getAllDepartments() {
        return toolService.getAllTools();
    }

}
