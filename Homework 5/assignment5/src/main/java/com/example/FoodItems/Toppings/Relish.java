package com.example.FoodItems.Toppings;

public class Relish implements Toppings {
    private double price = 0.50; 
    private FoodItem food; 

    public Relish(FoodItem food) {
        this.food = food; 
    }

    @Override
    public double getItemPrice() {
        return food.getItemPrice() + price; 
    }
}
