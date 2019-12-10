package com.evan.demo.CooKiT.models;

import java.util.ArrayList;

import com.evan.demo.CooKiT.models.IDish;

public interface IDate {
    void addDish(IDish dish);
    void deleteDish(IDish dish);
    ArrayList<IDish> getDishList();
    String getDateName();
    String getWeekDay();
    Double getExp();
}
