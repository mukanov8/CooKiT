package com.evan.demo.CooKiT;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.evan.demo.CooKiT.db.entity.Dish;
import com.evan.demo.CooKiT.models.IDish;

import java.util.ArrayList;

public class AnimalAdapter extends BaseAdapter {

    private ArrayList<IDish> animalList;
    private Context mcontent;

    public AnimalAdapter(ArrayList<IDish> animalList, Context content){
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
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = new ViewHolder();

        if(view == null){
            view = LayoutInflater.from(mcontent).inflate(R.layout.listview_item,null);
            holder.mtv = view.findViewById(R.id.item_list_animal_text);
            holder.mbt = view.findViewById(R.id.item_list_animal_button);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder)view.getTag();
        }
        holder.mtv.setText(animalList.get(i).getName());

        holder.mbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mcontent,"delete successful!",Toast.LENGTH_SHORT).show();
                animalList.remove(i);
                AnimalAdapter.this.notifyDataSetChanged();
            }
        });



        return view;
    }

    class ViewHolder{
        TextView mtv;
        Button mbt;
    }
}
