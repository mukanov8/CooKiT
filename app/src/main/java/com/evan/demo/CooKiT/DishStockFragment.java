package com.evan.demo.CooKiT;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.evan.demo.bottomnavigationdemo.R;


public class DishStockFragment extends Fragment {

    private TextView mtv;
    private Button mbt;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dishstock, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mtv = getActivity().findViewById(R.id.faxian);
        mbt = getActivity().findViewById(R.id.Buttomfaxian);
        mbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mtv.setText("点击了dishstock");
                getActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).add(R.id.ll_frameLayout,new MenuFragment(),null).commitAllowingStateLoss();
            }
        });
    }
}
