package com.example.buildingcompany.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Material {
    private @Id @GeneratedValue Long id;
    private String name;
    private Integer amount;
    private Integer minAmount;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Supplier supplier;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private MaterialCategory category;
    //TODO vypisovanie nefunuguje
}
