package com.example.buildingcompany.controller;

import com.example.buildingcompany.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.buildingcompany.service.UserService;

import java.util.List;

@RestController
@RequestMapping("api/user/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
