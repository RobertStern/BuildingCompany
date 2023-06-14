package com.example.buildingcompany.service;

import com.example.buildingcompany.model.Contract;
import com.example.buildingcompany.repository.ContractRepository;
import com.example.buildingcompany.repository.MaterialRepository;
import com.example.buildingcompany.utilities.CompleteContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractService {

    private final ContractRepository contractRepository;

    private final MaterialRepository materialRepository;

    @Autowired
    public ContractService(ContractRepository contractRepository, MaterialRepository materialRepository) {
        this.contractRepository = contractRepository;
        this.materialRepository = materialRepository;
    }

    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    public Contract getContractById(Long id) {
        Optional<Contract> contract = contractRepository.findById(id);
        return contract.orElse(null);
    }

    public CompleteContract startEvaluatingContract(Long employeeId, Long contractId) {
        return new CompleteContract(employeeId, contractId, contractRepository, materialRepository);
    }
}
