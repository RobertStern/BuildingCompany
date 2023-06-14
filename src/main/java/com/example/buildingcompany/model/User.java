package com.example.buildingcompany.model;

import com.example.buildingcompany.utilities.AbstractUser;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class User extends AbstractUser {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String address;
    //@JsonManagedReference
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Contract> contracts;
}
