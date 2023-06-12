package com.example.buildingcompany.repository;

import com.example.buildingcompany.model.MaterialCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialCategoryRepository extends JpaRepository<MaterialCategory, Long> {
}
