package com.example.buildingcompany.repository;

import com.example.buildingcompany.model.Tool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToolRepository extends JpaRepository<Tool, Long> {
}
