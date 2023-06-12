package com.example.buildingcompany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class House {
    private @Id
    @GeneratedValue Long id;
    private String name;
    private BigDecimal price;
    private Integer delivery_time;
    private Integer amount_available;
    private BigDecimal area;
}
