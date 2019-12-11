package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.db.entity.Ingredient;
import com.evan.demo.CooKiT.db.ingredientDatabase;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class IingredientDatabase_getTest {
    private IIngredient testIng1 = new Ingredient("testIng4", 4.0, 50000.0);
    private IIngredient testIng2 = new Ingredient("testIng5", 199.0, 100.0);
    private IIngredient testIng3 = new Ingredient("testIng6", 569.0, 2000.0);

    @Test
    public void getIngredient() {
        IingredientDatabase forTest = new ingredientDatabase();

        forTest.addIngredients(testIng1.getName(), testIng1.getQuantity(), testIng1.getPrice());
        forTest.addIngredients(testIng2.getName(), testIng2.getQuantity(), testIng2.getPrice());
        forTest.addIngredients(testIng3.getName(), testIng3.getQuantity(), testIng3.getPrice());

        assertEquals(forTest.getIngredient(testIng1.getName()).getName(), testIng1.getName());
        assertEquals(forTest.getIngredient(testIng1.getName()).getQuantity(), testIng1.getQuantity());
        assertEquals(forTest.getIngredient(testIng1.getName()).getPrice(), testIng1.getPrice());


        assertEquals(forTest.getIngredient(testIng2.getName()).getName(), testIng2.getName());
        assertEquals(forTest.getIngredient(testIng2.getName()).getQuantity(), testIng2.getQuantity());
        assertEquals(forTest.getIngredient(testIng2.getName()).getPrice(), testIng2.getPrice());


        assertEquals(forTest.getIngredient(testIng3.getName()).getName(), testIng3.getName());
        assertEquals(forTest.getIngredient(testIng3.getName()).getQuantity(), testIng3.getQuantity());
        assertEquals(forTest.getIngredient(testIng3.getName()).getPrice(), testIng3.getPrice());
    }
}