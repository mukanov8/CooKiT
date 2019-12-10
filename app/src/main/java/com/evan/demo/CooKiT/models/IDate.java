package com.example.cookit.models;

import java.util.ArrayList;

import com.example.cookit.models.IDish;

public interface IDate {
    void addDish(IDish dish);
    void deleteDish(IDish dish);
    ArrayList<IDish> getDishList();
    String getDateName();
    String getWeekDay();
    Double getExp();
}
