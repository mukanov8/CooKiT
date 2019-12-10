package com.evan.demo.CooKiT;

import android.app.Application;

import java.util.ArrayList;

public class myApplication extends Application {

    private ArrayList<Animal> animalList = new ArrayList<>();

    private String editContent;

    public myApplication(){
        animalList.add(new Animal("Steak"));
        animalList.add(new Animal("Soup"));
        animalList.add(new Animal("Chiken"));
        animalList.add(new Animal("Eggs"));
        animalList.add(new Animal("Pilaf"));
        animalList.add(new Animal("Toasts"));
        animalList.add(new Animal("Sanwitch"));
        animalList.add(new Animal("Pizza"));


        editContent = new String("初始文字");
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public String getEditContent() {
        return editContent;
    }

    public void setEditContent(String editContent) {
        this.editContent = editContent;
    }
}
