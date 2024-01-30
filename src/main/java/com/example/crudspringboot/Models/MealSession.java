package com.example.crudspringboot.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "Meal_Session")
@Entity
public class MealSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Meal_SessionId", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "MealId")
    private Meal mealId;

    @ManyToOne
    @JoinColumn(name = "SessionId")
    private Session sessionId;

    @Column(name = "Price")
    private Double price;

    @Column(name = "Quantity")
    private Integer quantity;

    @Column(name = "RemainQuantity")
    private Integer remainQuantity;

    @Column(name = "Status", length = 50)
    private String status;

    @Column(name = "CreateDate")
    private LocalDate createDate;

    @ManyToOne
    @JoinColumn(name = "KitchenId")
    private Kitchen kitchenId;

    @ManyToOne
    @JoinColumn(name = "AreaId")
    private Area areaId;

    public Area getAreaId() {
        return areaId;
    }

    public void setAreaId(Area areaId) {
        this.areaId = areaId;
    }

    public Kitchen getKitchenId() {
        return kitchenId;
    }

    public void setKitchenId(Kitchen kitchenId) {
        this.kitchenId = kitchenId;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRemainQuantity() {
        return remainQuantity;
    }

    public void setRemainQuantity(Integer remainQuantity) {
        this.remainQuantity = remainQuantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Session getSessionId() {
        return sessionId;
    }

    public void setSessionId(Session sessionId) {
        this.sessionId = sessionId;
    }

    public Meal getMealId() {
        return mealId;
    }

    public void setMealId(Meal mealId) {
        this.mealId = mealId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}