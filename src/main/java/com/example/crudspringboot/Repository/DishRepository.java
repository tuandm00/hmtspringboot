package com.example.crudspringboot.Repository;

import com.example.crudspringboot.Models.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Integer> {
}
