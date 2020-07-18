package com.q_silver.blood.view.fragment.splashCycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.q_silver.blood.R;
import com.q_silver.blood.adapter.SliderAdapter;
import com.q_silver.blood.view.activity.UserCycleActivity;
import com.q_silver.blood.view.fragment.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class SliderFragment extends BaseFragment {

    @BindView(R.id.fragment_slider_vp_slider)
    ViewPager fragmentSliderVpSlider;
    @BindView(R.id.fragment_slider_i_btn_slider_btn)
    ImageView fragmentSliderIBtnSliderBtn;
    @BindView(R.id.fragment_slider_tl_slider_tabs)
    TabLayout fragmentSliderTlSliderTabs;
    int position = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initFragment();
        View view = inflater.inflate(R.layout.fragment_slider, container, false);
        ButterKnife.bind(this, view);

        SliderAdapter sliderAdapter = new SliderAdapter(getActivity());

        sliderAdapter.addpage(R.drawable.ic_slider_one);
        sliderAdapter.addpage(R.drawable.ic_slider_two);
        sliderAdapter.addpage(R.drawable.ic_slider_one);

        fragmentSliderVpSlider.setAdapter(sliderAdapter);
        fragmentSliderTlSliderTabs.setupWithViewPager(fragmentSliderVpSlider, true);
        fragmentSliderVpSlider.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                    case 1:
                        fragmentSliderIBtnSliderBtn.setImageResource(R.drawable.ic_slider_ic_next);
                        break;
                    case 2:
                        fragmentSliderIBtnSliderBtn.setImageResource(R.drawable.ic_slider_ic_true);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        return view;
    }


    @OnClick(R.id.fragment_slider_i_btn_slider_btn)
    public void onViewClicked() {
        position = fragmentSliderVpSlider.getCurrentItem();
        if (position < 3) {
            position++;
            fragmentSliderVpSlider.setCurrentItem(position);
        }
        if (position == 3) {
            startActivity(new Intent(getActivity(), UserCycleActivity.class));

        }


    }

    @Override
    public void onBack() {
        getActivity().finish();
    }
}



