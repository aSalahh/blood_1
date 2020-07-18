package com.q_silver.blood.view.fragment.userCycle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.q_silver.blood.R;
import com.q_silver.blood.view.fragment.BaseFragment;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.q_silver.blood.helper.HelperMethod.replaceFragment;


public class ForgetPasswordFragment extends BaseFragment {

    @BindView(R.id.forget_password_fragment_et_phone_number)
    EditText forgetPasswordFragmentEtPhoneNumber;
    @BindView(R.id.forget_password_fragment_btn_send)
    Button forgetPasswordFragmentBtnSend;

    public ForgetPasswordFragment() {
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

        View view = inflater.inflate(R.layout.fragment_forgetpassword, container, false);
        ButterKnife.bind(this, view);
        return view;

    }


    @OnClick(R.id.forget_password_fragment_btn_send)
    public void onViewClicked() {
        //  checkcvalidation(){ }
        replaceFragment(Objects.requireNonNull(getActivity()).getSupportFragmentManager(), R.id.user_cycle_activity_fl_frame_fragment, new ResetPasswordFragment());

    }

    @Override
    public void onBack() {
        replaceFragment(Objects.requireNonNull(getActivity()).getSupportFragmentManager(), R.id.user_cycle_activity_fl_frame_fragment, new LoginFragment());
    }

}
