package com.example.Customer;
import java.util.HashMap;
import java.util.Map;

public class LoyaltyStatus {
    private Map<String, Double> discountRanks; 

    public LoyaltyStatus() {
        discountRanks = new HashMap<>(); 
        discountRanks.put("Bronze", 0.05); 
        discountRanks.put("Silver", 0.15); 
        discountRanks.put("Gold", 0.20); 
        discountRanks.put("Platinum", 0.25); 
        discountRanks.put("Diamond", 0.30); 
    }

    public double applyDiscounts(double totalCost, String ranks) {
        if(discountRanks.containsKey(ranks)) {
            double discountPercentage = discountRanks.get(ranks);
            double discountTotal = totalCost*discountPercentage; 

            return totalCost - discountTotal;
        }
        
        else {
            return totalCost; 
        }
    }
}
