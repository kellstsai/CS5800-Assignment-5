package com;

import com.example.Customer.LoyaltyStatus;
import com.example.Customer.Order;
import com.example.FoodItems.Burgers;
import com.example.FoodItems.FrenchFries;
import com.example.FoodItems.Toppings.FoodItem;
import com.example.FoodItems.Toppings.Ketchup;
import com.example.FoodItems.Toppings.Lettuce;
import com.example.FoodItems.Toppings.Meat;
import com.example.FoodItems.Toppings.Mustard;
import com.example.FoodItems.Toppings.Onions;
import com.example.FoodItems.Toppings.Relish;
import com.example.FoodItems.Toppings.Bacon;
import com.example.FoodItems.Toppings.Cheese;
import com.example.FoodItems.HotDog; 

public class DecoratorDriver {
    public static void main(String[] args) {

        //Customer Janet 
        FoodItem BurgersJanet = new Burgers(); 
        FoodItem FrenchFriesJanet = new FrenchFries(); 
        FoodItem HotDogJanet = new HotDog(); 

        BurgersJanet = new Cheese(BurgersJanet);
        BurgersJanet = new Lettuce(BurgersJanet); 
        BurgersJanet = new Ketchup(BurgersJanet); 
        BurgersJanet = new Meat(BurgersJanet); 
        FrenchFriesJanet = new Ketchup(FrenchFriesJanet); 
        HotDogJanet = new Relish(HotDogJanet); 

        Order Janet = new Order();
        Janet.addFoodItem(BurgersJanet);
        Janet.addFoodItem(FrenchFriesJanet);
        Janet.addFoodItem(HotDogJanet);

        double totalCostJanet = Janet.getFinalCost();
        String janet = "Janet"; 
        System.out.println("The total cost of the order for " + janet + " without any discounts will be: " + totalCostJanet + " dollars.");

    
        LoyaltyStatus loyaltyStatusJanet = new LoyaltyStatus(); 
        totalCostJanet = loyaltyStatusJanet.applyDiscounts(totalCostJanet, "Gold"); 

       System.out.println("The total cost of the order for " + janet + " with the loyalty discount will be: " + totalCostJanet + " dollars."); 

       //Customer Alex
       FoodItem FrenchFriesAlex = new FrenchFries(); 
       FoodItem HotDogAlex = new HotDog(); 

       FrenchFriesAlex = new Onions(FrenchFriesAlex); 
       HotDogAlex = new Ketchup(HotDogAlex);
       HotDogAlex = new Mustard(HotDogAlex); 

       Order Alex = new Order(); 
       Alex.addFoodItem(FrenchFriesAlex);
       Alex.addFoodItem(HotDogAlex);
    

       double totalCostAlex = Alex.getFinalCost(); 
       String alex = "Alex"; 
       System.out.println("The total cost of the order for " + alex + " without any discounts will be: " + totalCostAlex + " dollars.");

       LoyaltyStatus loyaltyStatusAlex = new LoyaltyStatus(); 
       totalCostAlex = loyaltyStatusAlex.applyDiscounts(totalCostAlex, "Bronze"); 

      System.out.println("The total cost of the order for " + alex + " with the loyalty discount will be: " + totalCostAlex + " dollars."); 

      //Customer Jin
      FoodItem BurgersJin = new Burgers(); 

      BurgersJin = new Meat(BurgersJin);
      BurgersJin = new Cheese(BurgersJin); 
      BurgersJin = new Bacon(BurgersJin); 

      Order Jin = new Order(); 
      Jin.addFoodItem(BurgersJin);

      double totalCostJin = Jin.getFinalCost(); 
      String jin = "Jin"; 

      System.out.println("The total cost of the order for " + jin + " without any discounts will be: " + totalCostJin + " dollars.");

    
        LoyaltyStatus loyaltyStatusJin = new LoyaltyStatus(); 
        totalCostJin = loyaltyStatusJanet.applyDiscounts(totalCostJin, "Diamond"); 

       System.out.println("The total cost of the order for " + jin + " with the loyalty discount will be: " + totalCostJin + " dollars."); 

    }

}