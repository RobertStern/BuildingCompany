package com.example.buildingcompany.controller;

import com.example.buildingcompany.model.Contract;
import com.example.buildingcompany.service.ContractService;
import com.example.buildingcompany.utilities.ListToXmlConvertor;
import lombok.NonNull;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Contract> getById(@PathVariable @NonNull Long id) {
        return ResponseEntity.ok(contractService.getContractById(id));
    }

    @GetMapping("xml")
    public String downloadFile() {
        List<Contract> contracts = contractService.getAllContracts();
        return ListToXmlConvertor.convertJsonToXml(contracts);
    }
}
