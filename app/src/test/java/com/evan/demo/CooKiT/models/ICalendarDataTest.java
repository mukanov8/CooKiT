package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.db.CalendarCalendarData;
import com.evan.demo.CooKiT.db.entity.Date;
import com.evan.demo.CooKiT.db.entity.Dish;

import org.junit.Test;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class ICalendarDataTest {
    private ArrayList<IDate> actualDates = new ArrayList<>();

    private static String packDate(Integer day, Integer month, Integer year) {
        month++;
        return day + "." + month + "." + year;
    }

    @Test
    public void getToday() {
        ICalendarData forTest = new CalendarCalendarData();
        Calendar today = Calendar.getInstance();
        String dateName = packDate(today.get(Calendar.DAY_OF_MONTH), today.get(Calendar.MONTH), today.get(Calendar.YEAR));
        assertEquals(forTest.getToday().getDateName(), dateName);
    }

    @Test
    public void selectDate() {
        ICalendarData forTest = new CalendarCalendarData();
        Calendar today = Calendar.getInstance();
        Random generator = new Random();

        today.add(Calendar.DAY_OF_MONTH, generator.nextInt(29));
        today.set(Calendar.MONTH, generator.nextInt(12));
        today.add(Calendar.YEAR, (generator.nextInt(2) - 1) * generator.nextInt(100));
        forTest.selectDate(today.get(Calendar.DAY_OF_MONTH), today.get(Calendar.MONTH) + 1, today.get(Calendar.YEAR));
        String dateName = packDate(today.get(Calendar.DAY_OF_MONTH), today.get(Calendar.MONTH), today.get(Calendar.YEAR));
        assertEquals((forTest.getToday()).getDateName(), dateName);
        assertEquals(forTest.getDates().size(), 2);
    }

    @Test
    public void updateDateDish() {
        ICalendarData forTest = new CalendarCalendarData();
        IDish testDish = new Dish("test1", 0.0, "test_ingredients1");
        forTest.updateDateDish(forTest.getToday(), testDish);
        IDate testDate = new Date();
        testDate.addDish(new Dish("test1", 0.0, "test_ingredients1"));
        actualDates.add(testDate);
        ArrayList<IDate> outputDates = forTest.getDates();
        assertEquals(outputDates.size(), actualDates.size());
        int n = outputDates.size();
        for (int i = 0; i < n; i++) {
            ArrayList<IDish> outputDishList = outputDates.get(i).getDishList();
            ArrayList<IDish> actualDishList = actualDates.get(i).getDishList();
            assertEquals(outputDishList.size(), actualDishList.size());
            int m = outputDishList.size();
            for (int j = 0; j < m; j++) {
                assertEquals(outputDishList.get(i).getName(), actualDishList.get(i).getName());
                assertEquals(outputDishList.get(i).getPrice(), actualDishList.get(i).getPrice());
                assertEquals(outputDishList.get(i).getIngredients(), actualDishList.get(i).getIngredients());
            }
        }
    }
}