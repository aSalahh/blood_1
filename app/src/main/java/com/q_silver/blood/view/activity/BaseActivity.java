package com.q_silver.blood.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import com.q_silver.blood.view.fragment.BaseFragment;

public class BaseActivity extends AppCompatActivity {
    public BaseFragment baseFragment;


    public void superBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onBackPressed() {
    baseFragment.onBack();
    }
}
