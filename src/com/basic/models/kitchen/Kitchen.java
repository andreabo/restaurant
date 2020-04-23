package com.basic.models.kitchen;

import com.basic.models.dishes.Dish;
import com.basic.menu.Menu;

import java.util.List;

import static com.basic.utils.Init.initIngredients;

public class Kitchen implements IKitchen {
    private Menu menu;
    private List<Ingredient> ingredients;

    public Kitchen(){
        this.ingredients = initIngredients();
    }


    @Override
    public void makeDish(Dish dish) {

    }

    @Override
    public void saleDish(Dish dish) {

    }
}
