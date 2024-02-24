package com.example.crudspringboot.Controller;

import com.example.crudspringboot.Models.User;
import com.example.crudspringboot.Services.UserService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @Operation(summary = "Get all User", description = "User must exist")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation",
                    response = User.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping("get-all-users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> userList = userService.getAllUsers();
        return ResponseEntity.ok(userList);
    }

    @Operation(summary = "Get single User", description = "User must exist")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation",
                    response = User.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping("get-single-user-by-id")
    public ResponseEntity<User> getUserById(int userid){
        User getSingleUserById = userService.getUserById(userid);
        return ResponseEntity.ok(getSingleUserById);
    }

    @PostMapping("login-user")
    public ResponseEntity<User> loginUser(String username, String password){
        User getUserInfo = userService.loginUser(username, password);
        return ResponseEntity.ok(getUserInfo);
    }

}
