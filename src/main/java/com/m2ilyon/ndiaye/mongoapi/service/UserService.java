package com.m2ilyon.ndiaye.mongoapi.service;

import com.m2ilyon.ndiaye.mongoapi.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsersByFirstname(String firstname);

    public List<User> getAllUsers();
}
