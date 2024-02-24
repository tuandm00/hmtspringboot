package com.example.crudspringboot.Repository;

import com.example.crudspringboot.Models.DishType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishTypeRepository extends JpaRepository<DishType, Integer> {
}
