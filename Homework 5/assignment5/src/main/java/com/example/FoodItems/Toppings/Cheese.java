package com.example.FoodItems.Toppings;

public class Cheese implements Toppings {
    private double price = 1.5; 
    private FoodItem food; 

    public Cheese(FoodItem food) {
        this.food = food; 
    }

    @Override
    public double getItemPrice() {
        return food.getItemPrice() + price; 
    }
}
