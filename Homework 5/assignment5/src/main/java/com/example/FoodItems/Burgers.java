package com.example.FoodItems;

import com.example.FoodItems.Toppings.FoodItem;

public class Burgers implements FoodItem {
    private double price = 15.0;

    @Override
    public double getItemPrice() {
        return price; 
    }
}
