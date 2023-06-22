package com.example.buildingcompany.model;

import com.example.buildingcompany.model.visitor.Element;
import com.example.buildingcompany.model.visitor.ElementVisitor;
import com.example.buildingcompany.utilities.DepartmentMember;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Employee implements DepartmentMember, Element {
    private @Id
    @GeneratedValue Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private double price;
    private double rentTime;
    private boolean forHire;

    @Override
    public void sendMessage(Message message) {
        Mailer.sendMail(email, message);
    }

    // observer - low amount of item
    public void update(Material material) {
        String message = material.getName() + " below minimal amount! set minimum: " + material.getMinAmount() +
                " actual amount: " + material.getAmount();
        Mailer.sendMail(email, message);
    }

    @Override
    public void accept(ElementVisitor elementVisitor) {
        elementVisitor.visitEmployee(this);
    }


    //TODO pridat odkaz na department
}
