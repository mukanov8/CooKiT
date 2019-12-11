package com.evan.demo.CooKiT.db;

import com.evan.demo.CooKiT.db.entity.Date;
import com.evan.demo.CooKiT.models.IDataBase;
import com.evan.demo.CooKiT.models.IDate;
import com.evan.demo.CooKiT.models.IDish;

import java.util.ArrayList;

public class DataBase implements IDataBase {
    private IDate today;
    private ArrayList<IDate> dates;

    public DataBase() {
        today = new Date();
        dates = new ArrayList<IDate>();
        dates.add(today);
    }

    public IDate getToday() {
        return today;
    }

    public void selectDate(Integer day, Integer month, Integer year) {
        String dateName = day.toString() + "." + month.toString() + '.' + year.toString();
        Boolean selected = Boolean.FALSE;
        for (int i = 0; i < dates.size(); i++) {
            if (dates.get(i).getDateName().equals(dateName)) {
                today = dates.get(i);
                selected = Boolean.TRUE;
                break;
            }
        }
        if (selected.equals(Boolean.TRUE)) return;
        today = new Date(null, 0.0, day, month, year);
        dates.add(today);
    }

    public void updateDateDish(IDate date, IDish dish) {
        for (int i = 0; i < dates.size(); i++) {
            if (dates.get(i).getDateName().equals(date.getDateName())) {
                dates.get(i).addDish(dish);
                return;
            }
        }
        IDate day = new Date();
        day.addDish(dish);
        dates.add(day);
    }

    public ArrayList<IDate> getDates() {
        return this.dates;
    }

}
