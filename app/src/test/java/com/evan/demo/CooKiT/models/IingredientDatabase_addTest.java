package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.db.entity.Ingredient;
import com.evan.demo.CooKiT.db.ingredientDatabase;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class IingredientDatabase_addTest {
    private IIngredient testIng1 = new Ingredient("testIng1", 100.0, 500.0);
    private IIngredient testIng2 = new Ingredient("testIng1", 20.0, 1000.0);
    private IIngredient testIng3 = new Ingredient("testIng1", 1.0, 200000.0);

    private ArrayList<IIngredient> actualData;
    @Test
    public void addIngredients() {
        IingredientDatabase forTest = new ingredientDatabase();

        forTest.addIngredients(testIng1.getName(), testIng1.getQuantity(), testIng1.getPrice());
        actualData.add(testIng1);
        forTest.addIngredients(testIng2.getName(), testIng2.getQuantity(), testIng2.getPrice());
        actualData.add(testIng2);
        forTest.addIngredients(testIng3.getName(), testIng3.getQuantity(), testIng3.getPrice());
        actualData.add(testIng3);

        ArrayList<IIngredient> outputData = forTest.getListOfIngredients();

        assertEquals(outputData.size(), actualData.size());

        int n = outputData.size();
        for (int i = 0; i < n; i++) {
            assertEquals(outputData.get(i).getName(), actualData.get(i).getName());
            assertEquals(outputData.get(i).getQuantity(), actualData.get(i).getQuantity());
            assertEquals(outputData.get(i).getPrice(), actualData.get(i).getPrice());
        }
    }
}