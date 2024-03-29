package com.example.FoodItems.Toppings;

public class Onions implements Toppings {
    private double price = 1.0; 
    private FoodItem food; 

    public Onions(FoodItem food) {
        this.food = food; 
    }

    @Override
    public double getItemPrice() {
        return food.getItemPrice() + price; 
    }
}
