package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.db.entity.Ingredient;
import com.evan.demo.CooKiT.db.IngredientStock;

import org.junit.Test;

import static org.junit.Assert.*;

public class IIngredientStock_ReduceTest {

    private IIngredient testIng1 = new Ingredient("testIng10", 10000.0, 50000.0);
    private IIngredient testIng2 = new Ingredient("testIng11", 1.0, 100.0);
    private IIngredient testIng3 = new Ingredient("testIng12", 10.0, 100.0);


    @Test
    public void reduceIngredient() {
        IIngredientStock forTest = new IngredientStock();
        forTest.addIngredients(testIng1.getName(), testIng1.getQuantity(), testIng1.getPrice());
        forTest.addIngredients(testIng2.getName(), testIng2.getQuantity(), testIng2.getPrice());
        forTest.addIngredients(testIng3.getName(), testIng3.getQuantity(), testIng3.getPrice());

        forTest.reduceIngredient(testIng1.getName(), 12000.0);

        assertEquals(forTest.getIngredient(testIng1.getName()).getQuantity(), testIng1.getQuantity(), 0.0);
        assertEquals(forTest.getIngredient(testIng1.getName()).getPrice(), testIng1.getPrice(), 0.0);


        forTest.reduceIngredient(testIng2.getName(), 1.0);
        assertEquals(forTest.getIngredient(testIng2.getName()).getQuantity(), 0.0, 0.0);
        assertEquals(forTest.getIngredient(testIng2.getName()).getPrice(), 0.0, 0.0);

        forTest.reduceIngredient(testIng3.getName(), 4.0);
        double pricePerQuantity = testIng3.getPrice() / testIng3.getQuantity();
        assertEquals(forTest.getIngredient(testIng3.getName()).getQuantity(), 6.0, 0.0);
        assertEquals(forTest.getIngredient(testIng3.getName()).getPrice(), pricePerQuantity * 6.0, 0.0);
    }
    
}