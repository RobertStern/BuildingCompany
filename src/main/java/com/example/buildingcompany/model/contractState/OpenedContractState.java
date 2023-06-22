package com.example.buildingcompany.model.contractState;

import com.example.buildingcompany.model.*;

public class OpenedContractState implements ContractState {
    @Override
    public void addMaterial(Contract contract, Material material) {
        contract.addMaterial(material);
    }

    @Override
    public void addHouse(Contract contract, House house) {

    }

    @Override
    public void addEmployee(Contract contract, Employee employee) {

    }

    @Override
    public void addTool(Tool tool) {

    }

    @Override
    public void removeTool(Tool tool) {

    }

    @Override
    public void removeHouse(House house) {

    }

    @Override
    public void removeMaterial(Material material) {

    }

    @Override
    public void removeEmployee(Employee employee) {

    }

    @Override
    public Status getStatus() {
        return null;
    }

    @Override
    public Set<House> getHouses() {
        return null;
    }

    @Override
    public Set<Material> getMaterials() {
        return null;
    }

    @Override
    public Set<Tool> getTools() {
        return null;
    }

    @Override
    public Set<Employee> getEmployees() {
        return null;
    }

    @Override
    public boolean acceptPayment(Payment payment) {
        return false;
    }

    @Override
    public boolean assignEmployee(Employee employee) {
        return false;
    }
}
