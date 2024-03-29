package com.example.Customer;
import java.util.ArrayList;
import java.util.List;

import com.example.FoodItems.Toppings.FoodItem;

public class Order {
    private List<FoodItem> items = new ArrayList<>();

    public void addFoodItem(FoodItem food) {
        items.add(food); 
    }

    public double getFinalCost() {
        double totalCost = 0;
        for (FoodItem item : items) {
            totalCost += item.getItemPrice();
        }
        return totalCost; 
    }
}
