package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.db.entity.Ingredient;

import org.junit.Test;

import static org.junit.Assert.*;

public class IIngredientTest {

    @Test
    public void addQuantity() {
        IIngredient testIng1 = new Ingredient("testIng13", 5699.0, 501200.0);
        IIngredient testIng2 = new Ingredient("testIng14", 341.0, 10340.0);
        IIngredient testIng3 = new Ingredient("testIng15", 423.0, 123141.0);

        testIng1.addQuantity(-1.0);

        assertEquals(testIng1.getQuantity(), 5699.0, 0.0);
        assertEquals(testIng1.getPrice(), 501200.0, 0.0);

        testIng2.addQuantity(0.0);

        assertEquals(testIng2.getQuantity(), 341.0, 0.0);
        assertEquals(testIng2.getPrice(), 10340.0, 0.0);

        testIng3.addQuantity(100.0);

        assertEquals(testIng3.getQuantity(), 423.0 + 100.0, 0.0);
        assertEquals(testIng3.getPrice(), 123141.0/423.0 * 523.0, 0.0);

    }

    @Test
    public void reduceQuantity() {
        IIngredient testIng1 = new Ingredient("testIng16", 200.0, 200.0);
        IIngredient testIng2 = new Ingredient("testIng17", 500.0, 10000.0);
        IIngredient testIng3 = new Ingredient("testIng18", 6.0, 100.0);
        IIngredient testIng4 = new Ingredient("testIng19", 100.0, 150.0);

        testIng1.reduceQuantity(-9.0);

        assertEquals(testIng1.getQuantity(), 200.0, 0.0);
        assertEquals(testIng1.getPrice(), 200.0, 0.0);

        testIng2.reduceQuantity(0.0);

        assertEquals(testIng2.getQuantity(), 500.0, 0.0);
        assertEquals(testIng2.getPrice(), 10000.0, 0.0);

        testIng3.reduceQuantity(10.0);

        assertEquals(testIng3.getQuantity(), 0.0, 0.0);
        assertEquals(testIng3.getPrice(), 0.0, 0.0);


        testIng4.reduceQuantity(3.0);

        assertEquals(testIng4.getQuantity(), 100.0 - 3.0, 0.0);
        assertEquals(testIng4.getPrice(), 150.0/100.0 * 97.0, 0.0);


    }
}