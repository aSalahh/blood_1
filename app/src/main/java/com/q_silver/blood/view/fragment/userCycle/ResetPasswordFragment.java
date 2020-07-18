package com.q_silver.blood.view.fragment.userCycle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.q_silver.blood.R;
import com.q_silver.blood.view.fragment.BaseFragment;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.q_silver.blood.helper.HelperMethod.replaceFragment;


public class ResetPasswordFragment extends BaseFragment {

    @BindView(R.id.reset_password_fragment_et_check_code)
    EditText resetPasswordFragmentEtCheckCode;
    @BindView(R.id.reset_password_fragment_et_new_password)
    EditText resetPasswordFragmentEtNewPassword;
    @BindView(R.id.reset_password_fragment_et_confirm_new_password)
    EditText resetPasswordFragmentEtConfirmNewPassword;
    @BindView(R.id.reset_password_fragment_btn_change)
    Button resetPasswordFragmentBtnChange;
    @BindView(R.id.reset_password_fragment_ll)
    LinearLayout resetPasswordFragmentLl;

    public ResetPasswordFragment() {
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

        View view = inflater.inflate(R.layout.fragment_resetpassword, container, false);
        ButterKnife.bind(this, view);
        return view;

    }


    @OnClick(R.id.reset_password_fragment_btn_change)
    public void onViewClicked() {
    }

    @Override
    public void onBack() {
        replaceFragment(Objects.requireNonNull(getActivity()).getSupportFragmentManager(), R.id.user_cycle_activity_fl_frame_fragment, new LoginFragment());
    }

}
