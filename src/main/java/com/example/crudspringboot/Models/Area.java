package com.example.crudspringboot.Models;

import jakarta.persistence.*;

@Entity
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AreaId", nullable = false)
    private Integer id;

    @Column(name = "Address", length = 50)
    private String address;

    @Column(name = "AreaName", length = 50)
    private String areaName;

    @ManyToOne
    @JoinColumn(name = "DistrictId")
    private District districtId;

    public District getDistrictId() {
        return districtId;
    }

    public void setDistrictId(District districtId) {
        this.districtId = districtId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}