package com.example.buildingcompany.controller;

import com.example.buildingcompany.model.Contract;
import com.example.buildingcompany.service.ContractService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/contract/")
public class ContractController {

    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("all")
    public List<Contract> getAllContracts() {
        return contractService.getAllContracts();
    }

    @GetMapping("{id}")
    public Contract getById(@PathVariable @NonNull Long id) {
        return contractService.getContractById(id);
    }
}
