package com.example.FoodItems.Toppings;

public class Meat implements FoodItem {
    private double price = 4.75; 
    private FoodItem food; 

    public Meat(FoodItem food) {
        this.food = food; 
    }

    @Override
    public double getItemPrice() {
        return food.getItemPrice() + price; 
    }
}
