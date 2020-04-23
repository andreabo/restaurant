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


    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public void makeDish(Dish dish) {

    }

    @Override
    public void saleDish(Dish dish) {

    }
}
