package com.example.buildingcompany.service;

import com.example.buildingcompany.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.buildingcompany.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
 private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
