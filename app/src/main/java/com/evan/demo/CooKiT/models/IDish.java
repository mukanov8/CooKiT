package com.evan.demo.CooKiT.models;

import android.util.Pair;

import com.evan.demo.CooKiT.models.IIngredient;

import java.util.ArrayList;

public interface IDish {
    void setName(String name);
    //void addIngredient(IIngredient ing, Double quantity);
    //void deleteIngredient(IIngredient ing);
    String getName();
    //ArrayList<Pair<IIngredient, Double> > getIngredientList();
    String getIngredients();
    void setIngredients(String list);
    Double getPrice();
}
