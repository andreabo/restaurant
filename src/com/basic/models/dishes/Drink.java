package com.basic.models.dishes;

public class Drink extends Dish {
    public Drink(String name) {
        super(name);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
