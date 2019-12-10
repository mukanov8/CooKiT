package com.evan.demo.CooKiT;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.evan.demo.bottomnavigationdemo.R;


public class BudgetFragment extends Fragment {

    private TextView mtv;

    private myApplication database;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_budget, container, false);
        mtv = view.findViewById(R.id.fragment_budget_text);
        database = (myApplication)getActivity().getApplicationContext();
        mtv.setText(database.getEditContent());
        return view;
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            mtv.setText(database.getEditContent());
        }

    }
}
