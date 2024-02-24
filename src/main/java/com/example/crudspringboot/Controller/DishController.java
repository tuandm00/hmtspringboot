package com.example.crudspringboot.Controller;

import com.example.crudspringboot.Models.Dish;
import com.example.crudspringboot.RequestModel.DishRequestModel;
import com.example.crudspringboot.Services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dish")
public class DishController {
    private final DishService dishService;

    @Autowired
    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @PostMapping("create-dish")
    public Dish CreateDish(@RequestBody DishRequestModel requestDish){
        return dishService.CreateDish(requestDish);
    }

    @GetMapping("get-all-dish")
    public List<Dish> GetAllDish(){
        return dishService.GetAllDish();
    }

    @DeleteMapping("delete-single-dish")
    public void DeleteDish(int dishId){
        dishService.DeleteDish(dishId);
    }

}
