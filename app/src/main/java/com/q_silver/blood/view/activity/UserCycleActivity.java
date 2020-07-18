package com.q_silver.blood.view.activity;

import android.os.Bundle;

import com.q_silver.blood.R;
import com.q_silver.blood.view.fragment.splashCycle.SplashFragment;
import com.q_silver.blood.view.fragment.userCycle.LoginFragment;

import static com.q_silver.blood.helper.HelperMethod.replaceFragment;

public class UserCycleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usercycle);
        replaceFragment(getSupportFragmentManager(), R.id.user_cycle_activity_fl_frame_fragment, new LoginFragment());

    }



}
