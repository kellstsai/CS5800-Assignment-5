package com.example.FoodItems.Toppings;

public class Mustard implements Toppings {
    private double price = 0.25; 
    private FoodItem food; 

    public Mustard(FoodItem food) {
        this.food = food; 
    }

    @Override
    public double getItemPrice() {
        return food.getItemPrice() + price; 
    }
}
