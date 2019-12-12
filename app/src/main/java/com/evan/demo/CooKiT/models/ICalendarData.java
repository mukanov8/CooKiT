package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.models.IDish;

import com.evan.demo.CooKiT.models.IDate;

import java.util.ArrayList;

public interface ICalendarData {
    IDate getToday();
    void selectDate(Integer day, Integer month, Integer year);
    void updateDateDish(IDate date, IDish dish);
    ArrayList<IDate> getDates();
    //void getStatData();
}
