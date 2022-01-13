package com.m2ilyon.ndiaye.mongoapi.repository;

import com.m2ilyon.ndiaye.mongoapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
