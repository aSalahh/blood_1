 package com.q_silver.blood.view.fragment.splashCycle;

 import android.content.Intent;
 import android.os.Bundle;
 import android.os.Handler;
 import android.view.LayoutInflater;
 import android.view.View;
 import android.view.ViewGroup;

 import androidx.fragment.app.FragmentManager;

 import com.q_silver.blood.R;
 import com.q_silver.blood.view.fragment.BaseFragment;

 import java.util.Objects;

 import butterknife.ButterKnife;

 import static com.q_silver.blood.helper.HelperMethod.replaceFragment;

 public class SplashFragment extends BaseFragment {
     private static FragmentManager fragmentManager;


     public SplashFragment() {
         // Required empty public constructor
     }

     @Override
     public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
         initFragment();
         View view= inflater.inflate(R.layout.fragment_splash, container, false);
         ButterKnife.bind(this,view);

         new Handler().postDelayed(new Runnable(){
             @Override
             public void run() {
                 replaceFragment(Objects.requireNonNull(getActivity()).getSupportFragmentManager(),
                         R.id.splash_cycle_activity_fl_frame_fragment, new SliderFragment());


             }
         }, 3000);
         return view;
     }

     @Override
     public void onBack() {
         getActivity().finish();
     }
 }
