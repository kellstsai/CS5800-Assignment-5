package com.example.FoodItems;

import com.example.FoodItems.Toppings.FoodItem;

public class HotDog implements FoodItem {
    double price = 7.50; 

    @Override
    public double getItemPrice() {
        return price; 
    }
}
