package com.evan.demo.CooKiT;

import android.app.Application;

import java.util.ArrayList;

public class myApplication extends Application {

    private ArrayList<Animal> animalList = new ArrayList<>();

    private String editContent;

    public myApplication(){
        animalList.add(new Animal("狮子"));
        animalList.add(new Animal("老虎"));
        animalList.add(new Animal("狗子"));
        animalList.add(new Animal("鸡"));
        animalList.add(new Animal("猪"));
        animalList.add(new Animal("鱼"));
        animalList.add(new Animal("人"));
        animalList.add(new Animal("熊"));
        animalList.add(new Animal("龙"));
        animalList.add(new Animal("老鼠"));
        animalList.add(new Animal("兔"));

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
