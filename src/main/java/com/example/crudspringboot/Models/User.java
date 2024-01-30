package com.example.crudspringboot.Models;

import jakarta.persistence.*;

@Table(name = "[User]", schema = "dbo")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId", nullable = false)
    private Integer id;

    @Column(name = "Name", length = 50)
    private String name;

    @Column(name = "Username", length = 50)
    private String username;

    @Column(name = "Password", length = 200)
    private String password;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "Phone", length = 50)
    private String phone;

    @Column(name = "Address", length = 50)
    private String address;

    @ManyToOne
    @JoinColumn(name = "DistrictId")
    private District districtId;

    @ManyToOne
    @JoinColumn(name = "RoleId")
    private Role roleId;

    @Column(name = "Status")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "AreaId")
    private Area areaId;

    @Column(name = "DeviceToken", length = 1000)
    private String deviceToken;

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public Area getAreaId() {
        return areaId;
    }

    public void setAreaId(Area areaId) {
        this.areaId = areaId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public District getDistrictId() {
        return districtId;
    }

    public void setDistrictId(District districtId) {
        this.districtId = districtId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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