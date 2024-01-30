package com.example.crudspringboot.Services;

import com.example.crudspringboot.Models.User;
import com.example.crudspringboot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     public User getUserById(int userid){
        return userRepository.findById(userid).orElse(null);
     }
}
