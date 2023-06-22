package com.example.buildingcompany.model;

import com.example.buildingcompany.model.contractState.ContractState;
import com.example.buildingcompany.model.contractState.OpenedContractState;
import com.example.buildingcompany.model.visitor.Element;
import com.example.buildingcompany.model.visitor.ElementVisitor;
import com.example.buildingcompany.model.visitor.PriceCalculationVisitor;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Contract implements ContractState {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private Date datePlaced;
    private Date dateDelivered;
    private Long employee_id;
    private String status;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private ContractState state;
    private Set<Element> elements;


    @Override
    public void addMaterial(Material material) {
        state.addMaterial(material);
    }

    @Override
    public void addHouse(House house) {
        state.addHouse(house);
    }

    @Override
    public void addEmployee(Employee employee) {
        state.addEmployee(employee);
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

    public double calculatePrice() {
        PriceCalculationVisitor visitor = new PriceCalculationVisitor();
        for (Element element : elements) {
            element.accept(visitor);
        }
        return visitor.getPrice();
    }

    // memento
    public ContractMemento save() {
        return new ContractMemento(elements);
    }

    public void restore(ContractMemento contractMemento) {
        this.elements = contractMemento.getElements();
    }

    public class ContractMemento {

        private final Set<Element> elements;

        public ContractMemento(Set<Element> elements) {
            this.elements = new HashSet<>(elements);
        }

        private Set<Element> getElements() {
            return elements;
        }
    }

    public Contract(Contract source) {
        this.datePlaced = new Date(System.currentTimeMillis());
        this.user = source.user;
        this.state = new OpenedContractState();
        this.elements = new HashSet<>(source.elements);
    }

    public Contract clone() {
        return new Contract(this);
    }
}
