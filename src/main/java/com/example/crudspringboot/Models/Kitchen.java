package com.example.crudspringboot.Models;

import jakarta.persistence.*;

@Entity
public class Kitchen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KitchenId", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}