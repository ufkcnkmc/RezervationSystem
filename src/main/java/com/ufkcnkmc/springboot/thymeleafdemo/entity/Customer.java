package com.ufkcnkmc.springboot.thymeleafdemo.entity;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length=50, nullable=false, unique=false)
    private String name;

    @Column(length=50, nullable=false, unique=false)
    private String email;

    @Column(length=50, nullable=false, unique=false)
    private String message;

    public Customer() {}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
