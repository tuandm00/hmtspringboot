package com.example.crudspringboot.Models;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustomerId", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private User userId;

    @Column(name = "Name", length = 50)
    private String name;

    @Column(name = "Address", length = 50)
    private String address;

    @Column(name = "Phone", length = 50)
    private String phone;

    @ManyToOne
    @JoinColumn(name = "DistrictId")
    private District districtId;

    @ManyToOne
    @JoinColumn(name = "AreaId")
    private Area areaId;

    public Area getAreaId() {
        return areaId;
    }

    public void setAreaId(Area areaId) {
        this.areaId = areaId;
    }

    public District getDistrictId() {
        return districtId;
    }

    public void setDistrictId(District districtId) {
        this.districtId = districtId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}