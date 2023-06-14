package com.example.buildingcompany.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Contract {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private Date datePlaced;
    private Date dateDelivered;
    private Long employee_id;
    private String status;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
