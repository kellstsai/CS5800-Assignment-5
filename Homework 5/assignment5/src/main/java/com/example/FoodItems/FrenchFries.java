package com.example.FoodItems;

import com.example.FoodItems.Toppings.FoodItem;

public class FrenchFries implements FoodItem {
    double price = 6.50; 

    @Override
    public double getItemPrice() {
        return price; 
    }
}
