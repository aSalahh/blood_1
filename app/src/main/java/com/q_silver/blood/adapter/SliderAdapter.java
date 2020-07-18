package com.q_silver.blood.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.q_silver.blood.R;
import com.q_silver.blood.view.fragment.splashCycle.SliderFragment;

import java.util.ArrayList;
import java.util.List;

public class SliderAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater inflater;
    public List<Integer>images=new ArrayList<>();

    public SliderAdapter(Context context){
        this.context=context;
    }
    public void addpage(Integer imge){
       images.add(imge);
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view== (ConstraintLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
     inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
           View itemview=inflater.inflate(R.layout.item_slider,container,false);
              ImageView item_slide_iv_imge=itemview.findViewById(R.id.item_slide_iv_imge);
                    item_slide_iv_imge.setImageResource(images.get(position));
                    container.addView(itemview);
                    return itemview;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((ConstraintLayout)object);
    }

}











