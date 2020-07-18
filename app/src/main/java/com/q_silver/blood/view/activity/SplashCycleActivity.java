package com.q_silver.blood.view.activity;

import android.os.Bundle;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.q_silver.blood.R;
import com.q_silver.blood.view.fragment.splashCycle.SplashFragment;

import static com.q_silver.blood.helper.HelperMethod.replaceFragment;

public class SplashCycleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashcycle);
        replaceFragment(getSupportFragmentManager(), R.id.splash_cycle_activity_fl_frame_fragment, new SplashFragment());
    }



}
