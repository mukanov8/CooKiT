package com.evan.demo.CooKiT.db;

import com.evan.demo.CooKiT.models.IDish;
import com.evan.demo.CooKiT.models.IdishDatabase;

import java.util.ArrayList;

public class dishDatabase implements IdishDatabase {
    private ArrayList<IDish> dishes;

    public dishDatabase() {
        dishes = null;
    }

    public void addDish(IDish dish) {
        if (dish == null) return;
        dishes.add(dish);
    }

    public void deleteDish(String name) {
        for (int i = dishes.size() - 1; i >= 0; i--) {
            if (dishes.get(i).getName().equals(name)) {
                dishes.remove(i);
            }
        }
    }

    public IDish getDish(String name) {
        for (int i = dishes.size() - 1; i >= 0; i--) {
            if (dishes.get(i).getName().equals(name)) {
                return dishes.get(i);
            }
        }
        return null;
    }
    public ArrayList<IDish> getListOfDishes() {
        return dishes;
    }
}
