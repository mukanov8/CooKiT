package com.example.cookit.models;

import com.example.cookit.models.IDish;

import com.example.cookit.models.IDate;

public interface IDataBase {
    void selectDate();
    void updateDateDish(IDate date, IDish dish);
    //void getStatData();
}
