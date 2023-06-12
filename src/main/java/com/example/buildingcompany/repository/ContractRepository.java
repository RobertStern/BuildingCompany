package com.example.buildingcompany.repository;

import com.example.buildingcompany.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
