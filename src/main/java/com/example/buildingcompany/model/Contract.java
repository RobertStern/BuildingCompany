package com.example.buildingcompany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
public class Contract {
    private @Id
    @GeneratedValue Long id;
    private Integer user_id;
    private Date datePlaced;
    private Date dateDelivered;
}
