package com.example.FoodItems.Toppings;

public class Lettuce implements Toppings {
    private double price = 0.50; 
    private FoodItem food; 

    public Lettuce(FoodItem food) {
        this.food = food; 
    }

    @Override
    public double getItemPrice() {
        return food.getItemPrice() + price; 
    }
}
