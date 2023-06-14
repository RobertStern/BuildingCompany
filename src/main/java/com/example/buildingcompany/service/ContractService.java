package com.example.buildingcompany.service;

import com.example.buildingcompany.model.Contract;
import com.example.buildingcompany.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractService {

    private final ContractRepository contractRepository;

    @Autowired
    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    public Contract getContractById(Long id) {
        Optional<Contract> contract = contractRepository.findById(id);
        return contract.orElse(null);
    }
}
