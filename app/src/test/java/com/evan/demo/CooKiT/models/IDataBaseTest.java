package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.db.DataBase;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class IDataBaseTest {

    @Test
    public void getToday() {
        IDataBase forTest = new DataBase();
        Calendar today = Calendar.getInstance();
        String dateName = today.get(Calendar.DAY_OF_MONTH) + "." + (today.get(Calendar.MONTH) + 1) + "." + today.get(Calendar.YEAR);
        assertEquals(forTest.getToday().getDateName(), dateName);
    }

    @Test
    public void selectDate() {

    }

    @Test
    public void updateDateDish() {
    }
}