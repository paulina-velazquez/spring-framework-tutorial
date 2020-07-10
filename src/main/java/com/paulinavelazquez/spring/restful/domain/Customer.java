package com.paulinavelazquez.spring.restful.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data   // Used to create Constructor, getters and setters
@Entity
public class Customer {

    @Id // JPA
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This is for the database
    private Long id;
    private String firstName;
    private String lastName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
