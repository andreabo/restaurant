package com.basic.models.dishes;

public class Dessert extends Dish{
    private double calories;

    public Dessert(String name) {
        super(name);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
