package com.q_silver.blood.view.fragment.userCycle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.q_silver.blood.R;
import com.q_silver.blood.view.fragment.BaseFragment;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.q_silver.blood.helper.HelperMethod.replaceFragment;


public class LoginFragment extends BaseFragment {

    @BindView(R.id.forget_password_fragment_et_phone_number)
    EditText forgetPasswordFragmentEtPhoneNumber;
    @BindView(R.id.login_fragment_et_password)
    EditText loginFragmentEtPassword;
    @BindView(R.id.login_fragment_tv_forget_password)
    TextView loginFragmentTvForgetPassword;
    @BindView(R.id.login_fragment_cb_remember_me)
    CheckBox loginFragmentCbRememberMe;
    @BindView(R.id.login_fragment_btn_login)
    Button loginFragmentBtnLogin;
    @BindView(R.id.login_fragment_tv_create_account)
    TextView loginFragmentTvCreateAccount;
    @BindView(R.id.reset_password_fragment_logo)
    ImageView resetPasswordFragmentLogo;

    public LoginFragment() {
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

        View view = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, view);
        return view;

    }


    @OnClick({R.id.login_fragment_tv_forget_password, R.id.login_fragment_cb_remember_me, R.id.login_fragment_btn_login, R.id.login_fragment_tv_create_account})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.login_fragment_tv_forget_password:
                replaceFragment(Objects.requireNonNull(getActivity()).getSupportFragmentManager(), R.id.user_cycle_activity_fl_frame_fragment, new ForgetPasswordFragment());
                break;
            case R.id.login_fragment_cb_remember_me:
                break;
            case R.id.login_fragment_btn_login:
                //checkValidation();
                break;
            case R.id.login_fragment_tv_create_account:
                replaceFragment(Objects.requireNonNull(getActivity()).getSupportFragmentManager(), R.id.user_cycle_activity_fl_frame_fragment, new RegisterFragment());
                break;
        }
    }

    @Override
    public void onBack() {
        getActivity().finishAffinity();
    }
}
