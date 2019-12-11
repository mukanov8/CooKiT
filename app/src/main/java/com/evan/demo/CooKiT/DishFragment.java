package com.evan.demo.CooKiT;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.evan.demo.CooKiT.db.entity.Dish;


public class DishFragment extends Fragment implements View.OnTouchListener {

    private EditText met1,met2,met3;

    private Button mbt;

    private TextView mtv;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dish_item,null);
        met1 = view.findViewById(R.id.dish_item_ingredients);
        met2 = view.findViewById(R.id.dish_item_price);
        met3 = view.findViewById(R.id.dish_item_name);
        mbt = view.findViewById(R.id.dish_item_confirm);
        mtv = view.findViewById(R.id.dish_item_title);
        mbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"successful!",Toast.LENGTH_SHORT).show();
                getActivity().getSupportFragmentManager().beginTransaction().remove(DishFragment.this).commitAllowingStateLoss();
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getArguments();
        if(bundle != null){
            met1.setText(bundle.getString("name"));
        }
        else {
            mtv.setText("New Dish");
        }

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        view.setOnTouchListener(this);
    }
}
