package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.models.IIngredient;

import java.util.ArrayList;

public interface IIngredientStock {
    void addIngredients(String name, Double quantity, Double price);
    void reduceIngredient(String name, Double quantity);
    IIngredient getIngredient(String name);
    ArrayList<IIngredient> getListOfIngredients();
    Boolean checkDish(String name, Double quantity);
}
