package com.example.crudspringboot.Models;

import jakarta.persistence.*;

@Entity
public class DishType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DishTypeId", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}