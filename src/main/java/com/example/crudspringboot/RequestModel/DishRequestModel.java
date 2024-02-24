package com.example.crudspringboot.RequestModel;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;

public class DishRequestModel {

    private String name;

    @Column(nullable = true)
    private String image;

    private Integer dishtypeId;

    private Integer kitchenId;

    public DishRequestModel(String name, String image, Integer dishtypeId, Integer kitchenId) {
        this.name = name;
        this.image = image;
        this.dishtypeId = dishtypeId;
        this.kitchenId = kitchenId;
    }

    public DishRequestModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getDishtypeId() {
        return dishtypeId;
    }

    public void setDishtypeId(Integer dishtypeId) {
        this.dishtypeId = dishtypeId;
    }

    public Integer getKitchenId() {
        return kitchenId;
    }

    public void setKitchenId(Integer kitchenId) {
        this.kitchenId = kitchenId;
    }
}
