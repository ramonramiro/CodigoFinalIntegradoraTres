package com.principal.subnetting.easy.sliders;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.principal.subnetting.easy.R;

public class SliderAdapterThree extends PagerAdapter {

    Context contextSliderUnitThree;
    LayoutInflater layoutInflater;




    public SliderAdapterThree(Context context){
        this.contextSliderUnitThree = context;    }

    //Arrays
    public int[] slideImages = {
            R.drawable.ic_pag1_unit_three,
            R.drawable.ic_pag2_unit_three,
            R.drawable.ic_pag3_unit_three
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
        layoutInflater = (LayoutInflater) contextSliderUnitThree.getSystemService(contextSliderUnitThree.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout_three, container, false);

        ImageView slideImageView = view.findViewById(R.id.image_slide_theory_three);

        slideImageView.setImageResource(slideImages[position]);

        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position,Object object) {
        container.removeView((LinearLayout)object);
    }
}

