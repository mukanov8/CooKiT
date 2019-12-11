package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.db.entity.Dish;

import org.junit.Test;

import static org.junit.Assert.*;

public class IDish_GetSetTest {

    @Test
    public void getIngredients() {
        IDish testDish = new Dish("test5", 1200000.0, "test_ingredients5");
        assertEquals(testDish.getIngredients(), "test_ingredients5");

        assertEquals(testDish.getPrice(), 1200000.0, 0.0);
    }

    @Test
    public void setIngredients() {
        IDish testDish = new Dish("test6", 4000.0, "test_ingredients6");
        assertEquals(testDish.getIngredients(), "test_ingredients6");
        assertEquals(testDish.getPrice(), 4000.0, 0.0);
    }
}