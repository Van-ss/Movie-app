package com.example.movies;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.LayoutInflater;
import androidx.viewpager.widget.PagerAdapter;


public class ImageAdapter extends PagerAdapter {
     Context context;
     private int[] images1;//Array of Images
     LayoutInflater mLayoutInflater;

    ImageAdapter(Context context, Movies movie){
        this.context=context;
        this.images1 = movie.getImages();//Get images depending on movie
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images1.length;
    }//length

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView= new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);//inserts image into View Pager
        imageView.setImageResource(images1[position]);
        container.addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView)object);//Destroy VeiwPager images
    }
}
