package com.m2ilyon.ndiaye.mongoapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Document
public class User {

    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String username;
    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    private BigDecimal totalExpenses;
    private LocalDateTime createdAt;

    public User(String firstname, String lastname, String username, String email, Gender gender,
                Address address, BigDecimal totalExpenses, LocalDateTime createdAt) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.totalExpenses = totalExpenses;
        this.createdAt = createdAt;
    }
}
