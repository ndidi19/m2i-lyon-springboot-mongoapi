package com.m2ilyon.ndiaye.mongoapi.repository;

import com.m2ilyon.ndiaye.mongoapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findUserByEmail(String email);

    @Query(value = "{firstname: ?0}")
    List<User> getUsersByFirstname(String firstname);
}
