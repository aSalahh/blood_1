package com.q_silver.blood.view.fragment.userCycle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.q_silver.blood.R;
import com.q_silver.blood.view.fragment.BaseFragment;

import butterknife.ButterKnife;


public class RegisterFragment extends BaseFragment {

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        initFragment();

        View view = inflater.inflate(R.layout.fragment_register, container, false);
        ButterKnife.bind(this, view);
        return view;

    }

    @Override
    public void onBack() {
        super.onBack();
    }
}
