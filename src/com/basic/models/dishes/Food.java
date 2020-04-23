package com.basic.models.dishes;

public class Food extends Dish {
    public Food(String name) {
        super(name);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
