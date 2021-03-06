package com.m2ilyon.ndiaye.mongoapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String street;
    private String zipCode;
    private String city;
    private String country;
}
