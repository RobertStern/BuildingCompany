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
public class Material {
    private @Id @GeneratedValue Long id;
    private String name;
    private Integer supplier_id;
    private Integer category_id;
    private Integer amount;
    private Integer minAmount;
}
