package com.example.crudspringboot.Services;

import com.example.crudspringboot.Models.Dish;
import com.example.crudspringboot.Models.DishType;
import com.example.crudspringboot.Models.Kitchen;
import com.example.crudspringboot.Repository.DishRepository;
import com.example.crudspringboot.Repository.DishTypeRepository;
import com.example.crudspringboot.Repository.KitchenRepository;
import com.example.crudspringboot.RequestModel.DishRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    private final DishRepository dishRepository;
    private final KitchenRepository kitchenRepository;
    private final DishTypeRepository dishTypeRepository;

    @Autowired
    public DishService(DishRepository dishRepository, KitchenRepository kitchenRepository, DishTypeRepository dishTypeRepository) {
        this.dishRepository = dishRepository;
        this.kitchenRepository = kitchenRepository;
        this.dishTypeRepository = dishTypeRepository;
    }

    public List<Dish> GetAllDish(){
        return dishRepository.findAll();
    }

    public Dish CreateDish(DishRequestModel requestDish){
        Dish dish = convertToDish(requestDish);
        return dishRepository.save(dish);
    }

    private Dish convertToDish(DishRequestModel requestDish) {
        Dish dish = new Dish();
        dish.setName(requestDish.getName());
        dish.setImage(requestDish.getImage());
        Kitchen kitchen = kitchenRepository.findById(requestDish.getKitchenId()).orElse(null);
        DishType dishtype = dishTypeRepository.findById(requestDish.getDishtypeId()).orElse(null);
        dish.setKitchenId(kitchen);
        dish.setDishTypeId(dishtype);

        return dish;
    }

    public void DeleteDish(int dishId){
         dishRepository.deleteById(dishId);
    }


}
