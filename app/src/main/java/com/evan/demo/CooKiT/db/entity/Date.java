package com.evan.demo.CooKiT.db.entity;

import com.evan.demo.CooKiT.models.IDate;
import com.evan.demo.CooKiT.models.IDish;

import java.util.ArrayList;
import java.util.Calendar;

public class Date implements IDate {
    private Integer day, month, year;
    private String weekDay;
    private ArrayList<IDish> dishes;
    private Double expenditure;

    private static String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday"};

    private static String toStringWeekDay(Integer day) {
        day--;
        return weekDays[day];
    }

    public Date () {
        dishes = new ArrayList<>();
        expenditure = 0.0;
        Calendar today = Calendar.getInstance();
        weekDay = toStringWeekDay(today.get(Calendar.DAY_OF_WEEK));
        day = today.get(Calendar.DAY_OF_MONTH);
        month = today.get(Calendar.MONTH) + 1;
        year = today.get(Calendar.YEAR);
    }

    public Date (ArrayList<IDish> dishes, Double expenditure, Integer day, Integer month, Integer year) {
        this.dishes = dishes;
        this.expenditure = expenditure;
        Calendar today = Calendar.getInstance();
        // implement auto weekDay recognition
        today.set(Calendar.DAY_OF_MONTH, day);
        today.set(Calendar.MONTH, month - 1);
        today.set(Calendar.YEAR, year);
        weekDay = toStringWeekDay(today.get(Calendar.DAY_OF_WEEK));
        this.day = day;
        this.month = month;
        this.year = year;
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
        expenditure += dish.getPrice();
    }
    public void deleteDish(IDish dish) {
        if (dishes.remove(dish))
            expenditure -= dish.getPrice();
    }
}
