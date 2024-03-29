package com.example.FoodItems.Toppings;

public class Bacon implements Toppings {
    private double price = 2.50; 
    private FoodItem food; 

    public Bacon(FoodItem food) {
        this.food = food; 
    }

    @Override
    public double getItemPrice() {
        return food.getItemPrice() + price; 
    }
}
