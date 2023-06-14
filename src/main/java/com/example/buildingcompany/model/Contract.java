package com.example.buildingcompany.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
public class Contract {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private Date datePlaced;
    private Date dateDelivered;
    private Long employee_id;
    private String status;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    //TODO vracat majitela contractu,
    // Employee nech sa odkazuje do tabulky,
    // Pridat podtriedy
}
