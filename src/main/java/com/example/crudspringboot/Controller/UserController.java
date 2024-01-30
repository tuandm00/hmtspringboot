package com.example.crudspringboot.Controller;

import com.example.crudspringboot.Models.User;
import com.example.crudspringboot.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("get-all-users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> userList = userService.getAllUsers();
        return ResponseEntity.ok(userList);
    }

    @GetMapping("get-single-user-by-id")
    public ResponseEntity<User> getUserById(int userid){
        User getSingleUserById = userService.getUserById(userid);
        return ResponseEntity.ok(getSingleUserById);
    }

}
