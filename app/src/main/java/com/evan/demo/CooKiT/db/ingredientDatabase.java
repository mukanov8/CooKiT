package com.evan.demo.CooKiT.db;

import com.evan.demo.CooKiT.db.entity.Ingredient;
import com.evan.demo.CooKiT.models.IIngredient;
import com.evan.demo.CooKiT.models.IingredientDatabase;

import java.util.ArrayList;

public class ingredientDatabase implements IingredientDatabase {
    private ArrayList<IIngredient> Ingredients;
    public ingredientDatabase() {
        Ingredients = new ArrayList<IIngredient> ();
    }

    public void addIngredients(String name, Double quantity, Double price) {
        if (quantity <= 0 || price <= 0) return;
        IIngredient newIng = new Ingredient(name, quantity, price);
        Ingredients.add(newIng);
    }

    private IIngredient searchByName(String name) {
        for (int i = 0; i < Ingredients.size(); i++) {
            if (Ingredients.get(i).getName().equals(name)) {
                return Ingredients.get(i);
            }
        }
        return null;
    }

    public Boolean checkDish(String name, Double quantity) {
        IIngredient ing = searchByName(name);
        if (ing == null) return Boolean.FALSE;
        if (ing.getQuantity() < quantity) return Boolean.FALSE;
        return Boolean.TRUE;
    }

    public void reduceIngredient(String name, Double quantity) {
        if (quantity <= 0 || checkDish(name, quantity).equals(Boolean.FALSE)) return;
        IIngredient ing = searchByName(name);
        if (ing == null) return;
        ing.reduceQuantity(quantity);
    }


    public IIngredient getIngredient(String name) {
        return searchByName(name);
    }


    public ArrayList<IIngredient> getListOfIngredients() {
        return Ingredients;
    }


}
