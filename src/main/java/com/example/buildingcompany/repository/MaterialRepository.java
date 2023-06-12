package com.example.buildingcompany.repository;

import com.example.buildingcompany.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Long> {
}
