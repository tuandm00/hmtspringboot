package com.example.crudspringboot.Services;

import com.example.crudspringboot.Models.User;
import com.example.crudspringboot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int userid){
        return userRepository.findById(userid).orElse(null);
    }

    public User loginUser(String username, String password){
        User user = userRepository.findByUsername(username);

        if (user == null || !passwordEncoder.matches(password, user.getPassword())){
            throw  new RuntimeException("Invalid username or password");
        }

        return  user;
    }
}
