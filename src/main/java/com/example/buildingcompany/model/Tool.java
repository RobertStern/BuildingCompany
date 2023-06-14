package com.example.buildingcompany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
public class Tool {
    private @Id
    @GeneratedValue Long id;
    private String name;
    private BigDecimal cost;
    private Integer amount_available;
}
