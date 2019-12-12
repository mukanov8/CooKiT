package com.evan.demo.CooKiT.models;

import java.util.ArrayList;

import com.evan.demo.CooKiT.models.IDish;

public interface IDishStock {
    void addDish(IDish dish);
    void deleteDish(String name);
    IDish getDish(String name);
    ArrayList<IDish> getListOfDishes();
}
