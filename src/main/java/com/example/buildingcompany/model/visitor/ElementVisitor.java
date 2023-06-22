package com.example.buildingcompany.model.visitor;

import com.example.buildingcompany.model.Employee;
import com.example.buildingcompany.model.House;
import com.example.buildingcompany.model.Material;
import com.example.buildingcompany.model.Tool;

public interface ElementVisitor {
    public void visitEmployee(Employee employee);
    public void visitTool(Tool tool);
    public void visitHouse(House house);
    public void visitMaterial(Material material);

}
