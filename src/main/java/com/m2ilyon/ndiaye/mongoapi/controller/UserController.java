package com.m2ilyon.ndiaye.mongoapi.controller;

import com.m2ilyon.ndiaye.mongoapi.model.User;
import com.m2ilyon.ndiaye.mongoapi.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{firstname}")
    public List<User> getAllUsersByFirstname(@PathVariable String firstname) {
        return userService.getAllUsersByFirstname(firstname);
    }
}
