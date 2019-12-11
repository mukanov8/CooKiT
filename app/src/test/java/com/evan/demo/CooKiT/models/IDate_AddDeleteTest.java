package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.db.entity.Date;
import com.evan.demo.CooKiT.db.entity.Dish;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class IDate_AddDeleteTest {
    private IDish testDish1 = new Dish("test2", 100.0, "test_ingredients2");
    private IDish testDish2 = new Dish("test3", 40.0, "test_ingredients3");
    private IDish testDish3 = new Dish("test4", 19999.0, "test_ingredients4");
    private ArrayList<IDish> actualDishList = new ArrayList<>();

    @Test
    public void getExp() {
        IDate testDate = new Date();

        testDate.addDish(testDish1);
        testDate.addDish(testDish2);
        testDate.addDish(testDish3);

        Double actualExpenditure = testDish1.getPrice() + testDish2.getPrice() + testDish3.getPrice();
        assertEquals(testDate.getExp(), actualExpenditure);
    }

    @Test
    public void addDish() {
        IDate testDate = new Date();

        testDate.addDish(testDish1);
        actualDishList.add(testDish1);

        assertEquals(testDate.getDishList().size(), actualDishList.size());
        int n = actualDishList.size();
        for (int i = 0; i < n; i++) {
            assertEquals(testDate.getDishList().get(i).getName(), actualDishList.get(i).getName());
            assertEquals(testDate.getDishList().get(i).getPrice(), actualDishList.get(i).getPrice());
            assertEquals(testDate.getDishList().get(i).getIngredients(), actualDishList.get(i).getIngredients());
        }


        testDate.addDish(testDish2);
        actualDishList.add(testDish2);

        assertEquals(testDate.getDishList().size(), actualDishList.size());
        n = actualDishList.size();
        for (int i = 0; i < n; i++) {
            assertEquals(testDate.getDishList().get(i).getName(), actualDishList.get(i).getName());
            assertEquals(testDate.getDishList().get(i).getPrice(), actualDishList.get(i).getPrice());
            assertEquals(testDate.getDishList().get(i).getIngredients(), actualDishList.get(i).getIngredients());
        }


        testDate.addDish(testDish2);
        actualDishList.add(testDish2);

        assertEquals(testDate.getDishList().size(), actualDishList.size());
        n = actualDishList.size();
        for (int i = 0; i < n; i++) {
            assertEquals(testDate.getDishList().get(i).getName(), actualDishList.get(i).getName());
            assertEquals(testDate.getDishList().get(i).getPrice(), actualDishList.get(i).getPrice());
            assertEquals(testDate.getDishList().get(i).getIngredients(), actualDishList.get(i).getIngredients());
        }
    }

    @Test
    public void deleteDish() {
        IDate testDate = new Date();

        testDate.addDish(testDish1);
        actualDishList.add(testDish1);
        testDate.addDish(testDish2);
        actualDishList.add(testDish2);
        testDate.addDish(testDish3);
        actualDishList.add(testDish3);

        testDate.deleteDish(testDish1);
        actualDishList.remove(testDish1);


        assertEquals(testDate.getDishList().size(), actualDishList.size());
        int n = actualDishList.size();
        for (int i = 0; i < n; i++) {
            assertEquals(testDate.getDishList().get(i).getName(), actualDishList.get(i).getName());
            assertEquals(testDate.getDishList().get(i).getPrice(), actualDishList.get(i).getPrice());
            assertEquals(testDate.getDishList().get(i).getIngredients(), actualDishList.get(i).getIngredients());
        }


        testDate.deleteDish(testDish2);
        actualDishList.remove(testDish2);

        assertEquals(testDate.getDishList().size(), actualDishList.size());
        n = actualDishList.size();
        for (int i = 0; i < n; i++) {
            assertEquals(testDate.getDishList().get(i).getName(), actualDishList.get(i).getName());
            assertEquals(testDate.getDishList().get(i).getPrice(), actualDishList.get(i).getPrice());
            assertEquals(testDate.getDishList().get(i).getIngredients(), actualDishList.get(i).getIngredients());
        }

        testDate.deleteDish(testDish3);
        actualDishList.remove(testDish3);


        assertEquals(testDate.getDishList().size(), actualDishList.size());
        n = actualDishList.size();
        for (int i = 0; i < n; i++) {
            assertEquals(testDate.getDishList().get(i).getName(), actualDishList.get(i).getName());
            assertEquals(testDate.getDishList().get(i).getPrice(), actualDishList.get(i).getPrice());
            assertEquals(testDate.getDishList().get(i).getIngredients(), actualDishList.get(i).getIngredients());
        }

    }
}