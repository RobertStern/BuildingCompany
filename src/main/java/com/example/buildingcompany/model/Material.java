package com.example.buildingcompany.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
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
}
