package com.basic.main;

import com.basic.models.kitchen.Kitchen;

public class Restaurant {
    public static Kitchen kitchen = new Kitchen();

    public static void main(String[] args) {
        kitchen.getIngredients().forEach(System.out::println);
    }


}
