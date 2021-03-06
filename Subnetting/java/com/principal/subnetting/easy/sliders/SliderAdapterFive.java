package com.principal.subnetting.easy.sliders;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.principal.subnetting.easy.R;

public class SliderAdapterFive extends PagerAdapter {

    Context contextSliderUnitFive;
    LayoutInflater layoutInflater;




    public SliderAdapterFive(Context context){
        this.contextSliderUnitFive = context;    }

    //Arrays
    public int[] slideImages = {
            R.drawable.ic_pag1_unit_five,
            R.drawable.ic_pag2_unit_five,
            R.drawable.ic_pag3_unit_five
    };



    public String[] slideHeadings = {
            "",
            "",
            ""
    };

    @Override
    public int getCount() {
        return slideHeadings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view ==  o;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) contextSliderUnitFive.getSystemService(contextSliderUnitFive.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout_five, container, false);

        ImageView slideImageView = view.findViewById(R.id.image_slide_theory_five);

        slideImageView.setImageResource(slideImages[position]);

        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position,Object object) {
        container.removeView((LinearLayout)object);
    }
}


