package com.example.crudspringboot.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FeedbackId", nullable = false)
    private Integer id;

    @Column(name = "Description", length = 50)
    private String description;

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private Customer customerId;

    @ManyToOne
    @JoinColumn(name = "KitchenId")
    private Kitchen kitchenId;

    @Column(name = "CreateDate")
    private LocalDate createDate;

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

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}