package com.m2ilyon.ndiaye.mongoapi.service.impl;

import com.m2ilyon.ndiaye.mongoapi.model.User;
import com.m2ilyon.ndiaye.mongoapi.repository.UserRepository;
import com.m2ilyon.ndiaye.mongoapi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsersByFirstname(String firstname) {
        return userRepository.getUsersByFirstname(firstname);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
