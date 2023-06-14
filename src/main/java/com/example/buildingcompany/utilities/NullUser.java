package com.example.buildingcompany.utilities;

import lombok.Getter;

@Getter
public class NullUser extends AbstractUser{
    private final String name = "Not Available in Customer Database";
    private final String surname = "Not Available in Customer Database";
    private final String email = "Not Available in Customer Database";
    private final String phone = "Not Available in Customer Database";
    private final String address = "Not Available in Customer Database";
}
