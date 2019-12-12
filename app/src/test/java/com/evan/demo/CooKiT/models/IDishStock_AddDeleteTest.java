package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.db.DishStock;
import com.evan.demo.CooKiT.db.entity.Dish;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class IDishStock_AddDeleteTest {
    private IDish testDish1 = new Dish("test7", 0.0, "test_ingredients7");
    private IDish testDish2 = new Dish("test8", 12.0, "test_ingredients8");
    private IDish testDish3 = new Dish("test9", 3214132.0, "test_ingredients9");
    private ArrayList<IDish> actualDishList = new ArrayList<>();

    @Test
    public void addDish() {
        IDishStock testDishDataBase = new DishStock();

        testDishDataBase.addDish(testDish1);
        actualDishList.add(testDish1);

        assertEquals(testDishDataBase.getListOfDishes().size(), actualDishList.size());
        int n = actualDishList.size();
        for (int i = 0; i < n; i++) {
            assertEquals(testDishDataBase.getListOfDishes().get(i).getName(), actualDishList.get(i).getName());
            assertEquals(testDishDataBase.getListOfDishes().get(i).getPrice(), actualDishList.get(i).getPrice());
            assertEquals(testDishDataBase.getListOfDishes().get(i).getIngredients(), actualDishList.get(i).getIngredients());
        }


        testDishDataBase.addDish(testDish2);
        actualDishList.add(testDish2);

        assertEquals(testDishDataBase.getListOfDishes().size(), actualDishList.size());
        n = actualDishList.size();
        for (int i = 0; i < n; i++) {
            assertEquals(testDishDataBase.getListOfDishes().get(i).getName(), actualDishList.get(i).getName());
            assertEquals(testDishDataBase.getListOfDishes().get(i).getPrice(), actualDishList.get(i).getPrice());
            assertEquals(testDishDataBase.getListOfDishes().get(i).getIngredients(), actualDishList.get(i).getIngredients());
        }

        testDishDataBase.addDish(testDish3);
        actualDishList.add(testDish3);

        assertEquals(testDishDataBase.getListOfDishes().size(), actualDishList.size());
        n = actualDishList.size();
        for (int i = 0; i < n; i++) {
            assertEquals(testDishDataBase.getListOfDishes().get(i).getName(), actualDishList.get(i).getName());
            assertEquals(testDishDataBase.getListOfDishes().get(i).getPrice(), actualDishList.get(i).getPrice());
            assertEquals(testDishDataBase.getListOfDishes().get(i).getIngredients(), actualDishList.get(i).getIngredients());
        }
    }

    @Test
    public void deleteDish() {
        IDishStock testDishDataBase = new DishStock();

        testDishDataBase.addDish(testDish1);
        actualDishList.add(testDish1);

        testDishDataBase.addDish(testDish2);
        actualDishList.add(testDish2);

        testDishDataBase.addDish(testDish3);
        actualDishList.add(testDish3);

        testDishDataBase.deleteDish(testDish1.getName());
        actualDishList.remove(testDish1);


        assertEquals(testDishDataBase.getListOfDishes().size(), actualDishList.size());
        int n = actualDishList.size();
        for (int i = 0; i < n; i++) {
            assertEquals(testDishDataBase.getListOfDishes().get(i).getName(), actualDishList.get(i).getName());
            assertEquals(testDishDataBase.getListOfDishes().get(i).getPrice(), actualDishList.get(i).getPrice());
            assertEquals(testDishDataBase.getListOfDishes().get(i).getIngredients(), actualDishList.get(i).getIngredients());
        }


        testDishDataBase.deleteDish(testDish2.getName());
        actualDishList.remove(testDish2);

        assertEquals(testDishDataBase.getListOfDishes().size(), actualDishList.size());
        n = actualDishList.size();
        for (int i = 0; i < n; i++) {
            assertEquals(testDishDataBase.getListOfDishes().get(i).getName(), actualDishList.get(i).getName());
            assertEquals(testDishDataBase.getListOfDishes().get(i).getPrice(), actualDishList.get(i).getPrice());
            assertEquals(testDishDataBase.getListOfDishes().get(i).getIngredients(), actualDishList.get(i).getIngredients());
        }

        testDishDataBase.deleteDish(testDish3.getName());
        actualDishList.remove(testDish3);


        assertEquals(testDishDataBase.getListOfDishes().size(), actualDishList.size());
        n = actualDishList.size();
        for (int i = 0; i < n; i++) {
            assertEquals(testDishDataBase.getListOfDishes().get(i).getName(), actualDishList.get(i).getName());
            assertEquals(testDishDataBase.getListOfDishes().get(i).getPrice(), actualDishList.get(i).getPrice());
            assertEquals(testDishDataBase.getListOfDishes().get(i).getIngredients(), actualDishList.get(i).getIngredients());
        }
    }
}