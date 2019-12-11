package com.evan.demo.CooKiT.db.entity;

import android.util.Pair;

import com.evan.demo.CooKiT.models.IDish;

import com.evan.demo.CooKiT.models.IIngredient;

import java.util.ArrayList;

public class Dish implements IDish {
    private String name;
    private Double totalPrice;
    //private ArrayList<Pair<IIngredient, Double>> Ingredients;
    private String ingredients;

    public Dish() {
        name = "";
        totalPrice = 0.0;
        //Ingredients = new ArrayList<>();
        ingredients = "";
    }

    public Dish(String name, Double totalPrice, String list) {
        this.name = name;
        this.totalPrice = totalPrice;
        this.ingredients = list;
    }

    public void setName(String name) {
        this.name = name;
    }
/*
    public void addIngredient(IIngredient ing, Double addQuantity) {
        if (ing == null || addQuantity == 0 || ing.getQuantity() == 0) return;
        Double pricePerQuantity = ing.getPrice() / ing.getQuantity();
        Double before = ing.getQuantity();
        ing.reduceQuantity(addQuantity);
        Double after = ing.getQuantity();
        if (before.equals(after)) return;
        totalPrice += pricePerQuantity * (before - after);
        Ingredients.add(new Pair<> (ing, before-after));
    }

    public void deleteIngredient(IIngredient ing) {
        for (int i = 0; i < Ingredients.size(); i++) {
            if (Ingredients.get(i).first == ing) {
                Ingredients.remove(i);
                break;
            }
        }
    }
*/
    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String list) {
        this.ingredients = list;
    }

    public Double getPrice() {
        return totalPrice;
    }

    public void setPrice(Double price){
        this.totalPrice = price;
    }
}
