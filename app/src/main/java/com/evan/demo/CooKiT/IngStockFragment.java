package com.evan.demo.CooKiT;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.evan.demo.bottomnavigationdemo.R;


public class IngStockFragment extends Fragment{

    private EditText met;

    private Button mbt;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ingstock, container, false);
        mbt = view.findViewById(R.id.fragment_ingstock_button);
        met = view.findViewById(R.id.fragment_ingstock_edit);
        mbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myApplication database = (myApplication)getActivity().getApplicationContext();
                database.setEditContent(met.getText().toString());
            }
        });
        return view;

    }
}
