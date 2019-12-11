package com.evan.demo.CooKiT;

import android.app.Application;

import com.evan.demo.CooKiT.db.DataBase;
import com.evan.demo.CooKiT.db.dishDatabase;
import com.evan.demo.CooKiT.db.entity.Dish;
import com.evan.demo.CooKiT.models.IDish;
import com.evan.demo.CooKiT.models.IdishDatabase;

import java.util.ArrayList;

public class myApplication extends Application {

    //private ArrayList<IDish> animalList = new ArrayList<>();

    private String editContent;

    private IdishDatabase idishDatabase;

    public myApplication(){
//        animalList.add(new Animal("Steak"));
//        animalList.add(new Animal("Soup"));
//        animalList.add(new Animal("Chiken"));
//        animalList.add(new Animal("Eggs"));
//        animalList.add(new Animal("Pilaf"));
//        animalList.add(new Animal("Toasts"));
//        animalList.add(new Animal("Sanwitch"));
//        animalList.add(new Animal("Pizza"));

        editContent = new String("origin text");

        idishDatabase = new dishDatabase();

        idishDatabase.addDish((new Dish("Steak",0.0,null)));
        idishDatabase.addDish((new Dish("meat",1.0,null)));
    }

    public ArrayList<IDish> getAnimalList() {
        return idishDatabase.getListOfDishes();
    }

    public void addDishToDishStock(IDish dish){
        idishDatabase.addDish(dish);
    }

    public String getEditContent() {
        return editContent;
    }

    public void setEditContent(String editContent) {
        this.editContent = editContent;
    }
}
