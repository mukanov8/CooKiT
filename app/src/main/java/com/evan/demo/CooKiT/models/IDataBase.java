package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.models.IDish;

import com.evan.demo.CooKiT.models.IDate;

public interface IDataBase {
    IDate getToday();
    void selectDate(Integer day, Integer month, Integer year);
    void updateDateDish(IDate date, IDish dish);
    //void getStatData();
}
