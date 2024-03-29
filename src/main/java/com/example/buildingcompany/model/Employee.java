package com.example.buildingcompany.model;

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
public class Employee {
    private @Id
    @GeneratedValue Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    //TODO pridat odkaz na department
}
