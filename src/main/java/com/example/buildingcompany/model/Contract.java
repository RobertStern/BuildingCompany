package com.example.buildingcompany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Contract {
    private @Id
    @GeneratedValue Long id;
    private Integer user_id;
    private Integer house_id;
    private Date datePlaced;
    private Date dateDelivered;
}
