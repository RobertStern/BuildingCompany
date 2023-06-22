package com.example.buildingcompany.model.visitor;

import com.example.buildingcompany.model.Employee;
import com.example.buildingcompany.model.House;
import com.example.buildingcompany.model.Material;
import com.example.buildingcompany.model.Tool;

public class PriceCalculationVisitor implements ElementVisitor {

    private double total = 0;

    @Override
    public void visitEmployee(Employee employee) {
        total += employee.getPrice() * employee.getRentTime();
    }

    @Override
    public void visitTool(Tool tool) {
        total += tool.getAmountOrdered() * tool.getCost();
    }

    @Override
    public void visitHouse(House house) {
        total += house.getAmountOrdered() * house.getPrice();
    }

    @Override
    public void visitMaterial(Material material) {
        total += material.getAmountOrdered() * material.getPrice();
    }

    public double getPrice() {
        return total;
    }
}
