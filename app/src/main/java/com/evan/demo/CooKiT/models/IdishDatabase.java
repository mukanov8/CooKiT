package com.example.cookit.models;

import java.util.ArrayList;

import com.example.cookit.models.IDish;

public interface IdishDatabase {
    void addDish(IDish dish);
    void deleteDish(String name);
    IDish getDish(String name);
    ArrayList<IDish> getListOfDishes();
}
