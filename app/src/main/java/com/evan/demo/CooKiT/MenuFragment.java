package com.evan.demo.CooKiT;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.evan.demo.CooKiT.models.IDish;

import java.util.ArrayList;


public class MenuFragment extends ListFragment {

    private AnimalAdapter madapter;

    private ArrayList<IDish> DishList;

    private TextView mtv;

    private Button mbt;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myApplication database = (myApplication)getActivity().getApplicationContext();

        DishList = database.idishDatabase.getListOfDishes();

        madapter = new AnimalAdapter(DishList,getActivity());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setListAdapter(madapter);
        View view = inflater.inflate(R.layout.fragment_menu,null);
        mbt = view.findViewById(R.id.fragment_meanu_add);

        mbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).add(R.id.ll_frameLayout,new DishFragment(),null).commitAllowingStateLoss();
            }
        });

        return view;
    }



    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Bundle bundle = new Bundle();
        bundle.putString("name",DishList.get(position).getName());
        bundle.putInt("position",position);
        DishFragment dishFragment = new DishFragment();
        dishFragment.setArguments(bundle);
        getActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).add(R.id.ll_frameLayout,dishFragment,null).commitAllowingStateLoss();
        Toast.makeText(getActivity(),DishList.get(position).getName(),Toast.LENGTH_SHORT).show();
    }
}
