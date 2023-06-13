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
    @GeneratedValue Long id;
    //private Long user_id;
    private Date datePlaced;
    private Date dateDelivered;
    private Long employee_id;
    private String status;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
