package com.example.FoodItems;

import com.example.FoodItems.Toppings.FoodItem;

abstract class DecoratorTopping implements FoodItem {
    protected FoodItem food; 
    
    public DecoratorTopping(FoodItem food) {
        this.food = food; 
    }
}
