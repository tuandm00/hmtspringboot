package com.example.crudspringboot.Models;

import jakarta.persistence.*;

@Table(name = "Meal_Dish")
@Entity
public class MealDish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Meal_DishId", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "MealId")
    private Meal mealId;

    @ManyToOne
    @JoinColumn(name = "DishId")
    private Dish dishId;

    public Dish getDishId() {
        return dishId;
    }

    public void setDishId(Dish dishId) {
        this.dishId = dishId;
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