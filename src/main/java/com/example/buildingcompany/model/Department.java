package com.example.buildingcompany.model;

import com.example.buildingcompany.utilities.DepartmentMember;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
public class Department implements DepartmentMember {
    private @Id
    @GeneratedValue Long id;
    private String name;
    private String location;
    private Set<Employee> employees;
    private Set<Department> subDepartments;

    @Override
    public void sendMessage(Message message) {
        for (Employee e : employees) {
            e.sendMessage(message);
        }

        for (Department d : subDepartments) {
            d.sendMessage(message);
        }
    }

    //TODO Pridat odkaz na super department
}
