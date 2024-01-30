package com.example.crudspringboot.Models;

import jakarta.persistence.*;

@Entity
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DistrictId", nullable = false)
    private Integer id;

    @Column(name = "DistrictName", length = 50)
    private String districtName;

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}