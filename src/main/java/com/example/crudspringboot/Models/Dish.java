package com.example.crudspringboot.Models;

import jakarta.persistence.*;

@Entity
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DishId", nullable = false)
    private Integer id;

    @Column(name = "Name", length = 50)
    private String name;

    @ManyToOne
    @JoinColumn(name = "DishTypeId")
    private DishType dishTypeId;

    @ManyToOne
    @JoinColumn(name = "KitchenId")
    private Kitchen kitchenId;

    @Column(name = "Image", length = 1000)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Kitchen getKitchenId() {
        return kitchenId;
    }

    public void setKitchenId(Kitchen kitchenId) {
        this.kitchenId = kitchenId;
    }

    public DishType getDishTypeId() {
        return dishTypeId;
    }

    public void setDishTypeId(DishType dishTypeId) {
        this.dishTypeId = dishTypeId;
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