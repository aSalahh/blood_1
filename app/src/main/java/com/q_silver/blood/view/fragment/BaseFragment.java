package com.q_silver.blood.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.q_silver.blood.R;
import com.q_silver.blood.view.activity.BaseActivity;


public class BaseFragment extends Fragment {
    public BaseActivity baseActivity;
    public void initFragment(){
        baseActivity=(BaseActivity)getActivity();
        baseActivity.baseFragment=this;

    }
    public void onBack(){
        baseActivity.superBackPressed();
    }

}
