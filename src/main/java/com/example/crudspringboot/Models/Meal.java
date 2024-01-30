package com.example.crudspringboot.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MealId", nullable = false)
    private Integer id;

    @Column(name = "Name", length = 50)
    private String name;

    @Column(name = "Image", length = 1000)
    private String image;

    @ManyToOne
    @JoinColumn(name = "KitchenId")
    private Kitchen kitchenId;

    @Column(name = "CreateDate")
    private LocalDate createDate;

    @Column(name = "Description", length = 50)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Kitchen getKitchenId() {
        return kitchenId;
    }

    public void setKitchenId(Kitchen kitchenId) {
        this.kitchenId = kitchenId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}