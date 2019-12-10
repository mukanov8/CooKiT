package com.evan.demo.CooKiT.models;

import com.evan.demo.CooKiT.db.DataBase;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Calendar;

public class IDataBaseTest {

    @Test
    public void getToday() {
        IDataBase forTest = new DataBase();
        String dateName = new Integer(Calendar.DAY_OF_MONTH) .toString() + "." + new Integer(Calendar.MONTH).toString() + '.' + new Integer(Calendar.YEAR).toString();
        assertEquals(forTest.getToday().getDateName(), dateName);
    }

    @Test
    public void selectDate() {

    }

    @Test
    public void updateDateDish() {
    }
}