package com.basic.models.dishes;

import com.basic.models.kitchen.Ingredient;

import java.util.List;

public abstract class Dish {
    private String name;
    private List<Ingredient> ingredients;

    public Dish(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }

    public abstract double calculatePrice();
}
