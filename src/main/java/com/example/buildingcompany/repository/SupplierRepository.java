package com.example.buildingcompany.repository;

import com.example.buildingcompany.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
