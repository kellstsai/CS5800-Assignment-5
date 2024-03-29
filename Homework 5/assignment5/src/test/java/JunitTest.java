import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.example.Customer.LoyaltyStatus;
import com.example.Customer.Order;
import com.example.FoodItems.Burgers;
import com.example.FoodItems.FrenchFries;
import com.example.FoodItems.Toppings.Cheese;
import com.example.FoodItems.Toppings.FoodItem;
import com.example.FoodItems.Toppings.Ketchup;
import com.example.FoodItems.Toppings.Lettuce;
import com.example.FoodItems.Toppings.Meat;
import com.example.FoodItems.Toppings.Mustard;
import com.example.FoodItems.Toppings.Onions;
import com.example.FoodItems.Toppings.Relish;
import com.example.FoodItems.HotDog;

public class JunitTest {

    @Test
    public void testLoyaltyStatusDiscount() {
        LoyaltyStatus ranks = new LoyaltyStatus(); 
        String customerRankSilver = "Silver"; 
        double totalCostBeforeDiscount = 100.0;
        assertEquals(85.0, ranks.applyDiscounts(totalCostBeforeDiscount, customerRankSilver), 0.01); 

        String customerRankBronze = "Bronze";
        assertEquals(95.0, ranks.applyDiscounts(totalCostBeforeDiscount, customerRankBronze), 0.01); 

        String customerRankGold = "Gold";
        assertEquals(80.0, ranks.applyDiscounts(totalCostBeforeDiscount, customerRankGold), 0.01); 

        String customerRankPlatinum = "Platinum";
        assertEquals(75.0, ranks.applyDiscounts(totalCostBeforeDiscount, customerRankPlatinum), 0.01);

        String customerRankDiamond = "Diamond"; 
        assertEquals(70.0, ranks.applyDiscounts(totalCostBeforeDiscount, customerRankDiamond), 0.01); 
    }
    
    @SuppressWarnings("deprecation")
    @Test
    public void testCostOfItems() {
        FoodItem hotDog = new HotDog(); 
        FoodItem burgers = new Burgers(); 
        FoodItem frenchFries = new FrenchFries();

        assertEquals(7.50, hotDog.getItemPrice(), 0.0); 

        assertEquals(15, burgers.getItemPrice(), 0); 

        assertEquals(6.50, frenchFries.getItemPrice(), 0);

    }

    @Test
    public void testFinalCostOfOrder() {

        //Janet
        FoodItem frenchFries = new FrenchFries(); 
        frenchFries = new Ketchup(frenchFries); 
        assertEquals(6.75, frenchFries.getItemPrice(), 0);

        Order Janet = new Order(); 
        FoodItem burgersJanet = new Burgers(); 
        FoodItem frenchFriesJanet = new FrenchFries();
        FoodItem hotDogJanet = new HotDog(); 

        burgersJanet = new Cheese(burgersJanet);
        burgersJanet = new Lettuce(burgersJanet); 
        burgersJanet = new Ketchup(burgersJanet);
        burgersJanet = new Meat(burgersJanet); 
        frenchFriesJanet = new Ketchup(frenchFriesJanet);
        hotDogJanet = new Relish(hotDogJanet); 

        Janet.addFoodItem(burgersJanet);
        Janet.addFoodItem(frenchFriesJanet);
        Janet.addFoodItem(hotDogJanet);

        assertEquals(36.75, Janet.getFinalCost(), 0); 

        //Alex
        Order Alex = new Order(); 
        FoodItem frenchFriesAlex = new FrenchFries();
        FoodItem hotDogAlex = new HotDog(); 

        frenchFriesAlex = new Onions(frenchFriesAlex); 
        hotDogAlex = new Ketchup(hotDogAlex);
        hotDogAlex = new Mustard(hotDogAlex); 

        Alex.addFoodItem(frenchFriesAlex);
        Alex.addFoodItem(hotDogAlex);

        assertEquals(15.5, Alex.getFinalCost(), 0); 
    }
}
