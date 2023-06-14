package com.example.buildingcompany.utilities;

import com.example.buildingcompany.model.Contract;
import com.example.buildingcompany.model.Material;
import com.example.buildingcompany.repository.ContractRepository;
import com.example.buildingcompany.repository.MaterialRepository;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@Getter
@Data
public class CompleteContract {
    private final Contract contract;
    private final List<Material> materials;

    public CompleteContract(Long employeeId, Long contractId, ContractRepository contractRepository, MaterialRepository materialRepository) {
        this.contract = contractRepository.findById(contractId).get();
        contract.setEmployee_id(employeeId);
        contract.setStatus("processing");
        materials = materialRepository.findAll();
    }

}
