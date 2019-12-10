package com.example.cookit.models;

import android.util.Pair;

import com.example.cookit.models.IIngredient;

import java.util.ArrayList;

public interface IDish {
    void setName(String name);
    void addIngredient(IIngredient ing, Double quantity);
    void deleteIngredient(IIngredient ing);
    String getName();
    ArrayList<Pair<IIngredient, Double> > getIngredientList();
    Double getPrice();
}
