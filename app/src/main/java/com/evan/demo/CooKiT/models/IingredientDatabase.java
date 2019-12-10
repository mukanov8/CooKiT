package com.cookit.models;

import com.example.cookit.models.IIngredient;

import java.util.ArrayList;

public interface IingredientDatabase {
    void addIngredients(String name, Double quantity, Double price);
    void reduceIngredient(String name, Double quantity);
    IIngredient getIngredient(String name);
    ArrayList<IIngredient> getListOfIngredients();
    Boolean checkDish(String name, Double quantity);
}
