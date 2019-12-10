package com.evan.db.entity;

import com.example.cookit.models.IDish;

import java.util.ArrayList;
import java.util.Calendar;

public class Date {
    private Integer day, month, year;
    private String weekDay;
    private ArrayList<IDish> dishes;
    private Double expenditure;

    private static String[] weekDays = {"Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday", "Sunday"};

    private static String toStringWeekDay(Integer day) {
        day--;
        return weekDays[day];
    }

    public Date () {
        dishes = null;
        expenditure = 0.0;
        weekDay = toStringWeekDay(Calendar.DAY_OF_WEEK);
        day = Calendar.DAY_OF_MONTH;
        month = Calendar.MONTH;
        year = Calendar.YEAR;
    }

    public Date (ArrayList<IDish> dishes, Double expenditure) {
        this.dishes = dishes;
        this.expenditure = expenditure;
        weekDay = toStringWeekDay(Calendar.DAY_OF_WEEK);
        day = Calendar.DAY_OF_MONTH;
        month = Calendar.MONTH;
        year = Calendar.YEAR;
    }

    public String getDateName() {
        return day.toString() + "." + month.toString() + '.' + year.toString();
    }

    public String getWeekDay() {
        return weekDay;
    }

    public Double getExp() {
        return expenditure;
    }

    public ArrayList<IDish> getDishList() {
        return dishes;
    }

    public void addDish(IDish dish) {
        dishes.add(dish);
    }
    public void deleteDish(IDish dish) {
        dishes.remove(dish);
    }
}
