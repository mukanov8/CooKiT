package com.evan.demo.CooKiT;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



import java.util.ArrayList;

public class AnimalAdapter extends BaseAdapter {

    private ArrayList<Animal> animalList;
    private Context mcontent;

    public AnimalAdapter(ArrayList<Animal> animalList,Context content){
        this.animalList = animalList;
        mcontent = content;
    }
    @Override
    public int getCount() {
        return animalList.size();
    }

    @Override
    public Object getItem(int i) {
        return animalList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = new ViewHolder();

        if(view == null){
            view = LayoutInflater.from(mcontent).inflate(R.layout.listview_item,null);
            holder.mtv = view.findViewById(R.id.item_list_animal_text);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder)view.getTag();
        }
        holder.mtv.setText(animalList.get(i).getName());

        return view;
    }

    class ViewHolder{
        TextView mtv;
    }
}
