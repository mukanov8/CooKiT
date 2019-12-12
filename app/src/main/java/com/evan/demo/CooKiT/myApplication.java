package com.evan.demo.CooKiT;

import android.app.Application;

import com.evan.demo.CooKiT.db.DishStock;
import com.evan.demo.CooKiT.db.entity.Dish;
import com.evan.demo.CooKiT.models.IDishStock;

public class myApplication extends Application {

    //private ArrayList<IDish> animalList = new ArrayList<>();

    private String editContent;

    public IDishStock IDishStock;

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


        IDishStock = new DishStock();
        IDishStock.addDish((new Dish("Steak",10.0,"orangle")));
        IDishStock.addDish((new Dish("meat",1.0,"meat")));
    }




    public String getEditContent() {
        return editContent;
    }

    public void setEditContent(String editContent) {
        this.editContent = editContent;
    }
}
