package com.example.movies;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.util.ArrayList;

public class MovieAdapter extends ArrayAdapter<Movies> {

    private static class ViewHolder{
        public ImageView ivCover;
        public TextView  tvName;
        public TextView  tvDirector;
        public TextView  tvYear;
    }
    public MovieAdapter(Context context, ArrayList<Movies> aMovies){
        super(context,0,aMovies);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final Movies movies = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listviewitem,parent,false);
            viewHolder.ivCover = (ImageView)convertView.findViewById(R.id.ivMovieCover);
            Animation animFadeIn = AnimationUtils.loadAnimation(getContext().getApplicationContext(),R.anim.fade_in); //animation
            //https://www.tutlane.com/tutorial/android/android-fade-in-out-animations-with-examples
            viewHolder.ivCover.startAnimation(animFadeIn);
            viewHolder.tvName = (TextView)convertView.findViewById(R.id.tvName);
            viewHolder.tvDirector = (TextView)convertView.findViewById(R.id.tvDirector);
            viewHolder.tvYear = (TextView)convertView.findViewById(R.id.tvYear);
            convertView.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //Populate the data into the template view using the data object
        viewHolder.tvName.setText(movies.getMovieName());
        viewHolder.tvDirector.setText(movies.getDirector());
        viewHolder.tvYear.setText(movies.getYear());
        int resID = movies.getCover();
        viewHolder.ivCover.setImageResource(resID);
        return convertView;
    }
}
