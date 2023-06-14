package com.example.buildingcompany.service;

import com.example.buildingcompany.model.User;
import com.example.buildingcompany.utilities.AbstractUser;
import com.example.buildingcompany.utilities.NullUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.buildingcompany.repository.UserRepository;

import java.util.List;
import java.util.Optional;

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

    public AbstractUser getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }
        return new NullUser();
    }
}
