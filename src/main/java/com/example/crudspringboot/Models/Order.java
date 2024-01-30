package com.example.crudspringboot.Models;

import jakarta.persistence.*;

import java.time.Instant;

@Table(name = "\"Order\"")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderId", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private Customer customerId;

    @Column(name = "Status", length = 50)
    private String status;

    @Column(name = "TotalPrice")
    private Integer totalPrice;

    @Column(name = "\"Time\"")
    private Instant time;

    @ManyToOne
    @JoinColumn(name = "Meal_SessionId")
    private MealSession mealSessionid;

    @Column(name = "Quantity")
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public MealSession getMealSessionid() {
        return mealSessionid;
    }

    public void setMealSessionid(MealSession mealSessionid) {
        this.mealSessionid = mealSessionid;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}