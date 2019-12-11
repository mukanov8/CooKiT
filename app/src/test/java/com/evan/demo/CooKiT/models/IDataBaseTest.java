package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.db.DataBase;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class IDataBaseTest {

    @Test
    public void getToday() {
        IDataBase forTest = new DataBase();
        Calendar today = Calendar.getInstance();
        String dateName = today.get(Calendar.DAY_OF_MONTH) + "." + (today.get(Calendar.MONTH) + 1) + "." + today.get(Calendar.YEAR);
        assertEquals(forTest.getToday().getDateName(), dateName);
    }
/*
    @Test
    public void selectDate() {
        IDataBase forTest = new DataBase();
        Calendar calendar = Calendar.getInstance();
        Random generator = new Random();

        calendar.add(Calendar.DAY_OF_MONTH, generator.nextInt(29));
        calendar.add(Calendar.MONTH, generator.nextInt(11) + 1);
        calendar.add(Calendar.YEAR, (generator.nextInt(2) - 1) * generator.nextInt(100));
        forTest.selectDate(calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR));
        String dateName = today.get(Calendar.DAY_OF_MONTH) + "." + (today.get(Calendar.MONTH) + 1) + "." + today.get(Calendar.YEAR);
        assertEquals(forTest.getToday(), );
    }
*/
    @Test
    public void updateDateDish() {
    }
}