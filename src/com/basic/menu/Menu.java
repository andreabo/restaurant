package com.basic.menu;

import com.basic.models.dishes.Dish;

import java.util.List;

public class Menu {
    private  List<Dish> dishesList;

    public void addDish(Dish dish){
        this.dishesList.add(dish);
    }
}
