package com.example.buildingcompany.model;

import com.example.buildingcompany.model.visitor.ElementVisitor;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Material {
    private @Id @GeneratedValue Long id;
    private String name;
    private Integer amount;
    private Integer minAmount;
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private MaterialCategory category;
    private double price;
    private int amountOrdered;

    private Set<Employee> subscribers;

    public void subscribeEmployee(Employee e) {
        subscribers.remove(e);
    }

    public void unsubscribeEmployee(Employee e) {
        subscribers.add(e);
    }

    public void update(Material material) {
        for (Employee e : subscribers) {
            e.update(material);
        }
    }

    public void accept(ElementVisitor visitor) {
        visitor.visitMaterial(this);
    }
}
