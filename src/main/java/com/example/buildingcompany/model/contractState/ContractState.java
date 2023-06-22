package com.example.buildingcompany.model.contractState;

import com.example.buildingcompany.model.*;

public interface ContractState {
     void addMaterial(Contract contract, Material material);
     void addHouse(Contract contract, House house);
     void addEmployee(Contract contract, Employee employee);
     void addTool(Contract contract, Tool tool);
     void removeTool(Contract contract, Tool tool);
     void removeHouse(Contract contract, House house);
     void removeMaterial(Contract contract, Material material);
     void removeEmployee(Contract contract, Employee employee);
     Status getStatus(Contract contract);
     Set<House> getHouses(Contract contract);
     Set<Material> getMaterials(Contract contract);
     Set<Tool> getTools(Contract contract);
     Set<Employee> getEmployees(Contract contract);
     boolean acceptPayment(Contract contract, Payment payment);
     boolean assignEmployee(Contract contract, Employee employee);
}
