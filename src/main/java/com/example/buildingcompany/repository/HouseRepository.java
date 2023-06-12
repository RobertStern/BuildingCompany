package com.example.buildingcompany.repository;

import com.example.buildingcompany.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long> {
}
