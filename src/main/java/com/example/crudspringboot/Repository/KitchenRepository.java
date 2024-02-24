package com.example.crudspringboot.Repository;

import com.example.crudspringboot.Models.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitchenRepository extends JpaRepository<Kitchen, Integer> {

}
