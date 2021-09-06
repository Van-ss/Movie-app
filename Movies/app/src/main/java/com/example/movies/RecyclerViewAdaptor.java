package com.example.movies;
import android.content.Intent;
import android.view.View;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;

public class RecyclerViewAdaptor extends RecyclerView.Adapter<RecyclerViewAdaptor.ViewHolder> {

    // To make your view item clickable ensure that the view holder class implements View.OnClickListener and it has the onClick(View v) method.
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // Declare objects of all the views to be manipulated in item_contact.xml
        public TextView lvMovie;
        public ImageView lvCover;

        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(this);
            // Initialize the view objects
            lvMovie = v.findViewById(R.id.tvName);
            lvCover = v.findViewById((R.id.ivMovieCover));
        }

        @Override
        public void onClick(View v) {
            // What to do when the view item is clicked
            Context context = v.getContext();
            Intent intent = new Intent(context, MovieDetailActivity.class);
            intent.putExtra("Movies", mContacts.get(getAdapterPosition()));
            context.startActivity(intent);


        }
    }

    // Declare the data collection object that holds the data to be populated in the RecyclerView
    private final List<Movies> mContacts;

    // Pass in the contact array object into the constructor
    public RecyclerViewAdaptor(List<Movies> contacts) {
        // The contacts object is sent via the activity that creates this adaptor
        mContacts = contacts;
    }

    // Usually involves inflating a layout from XML and returning the holder
    @NonNull
    @Override
    public RecyclerViewAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context mContext = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(mContext);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.item_movies, parent, false);

        // Return a new holder instance
        ViewHolder holder = new ViewHolder(contactView);
        return holder;
    }

    // This method populates the data from mContacts to the view items
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdaptor.ViewHolder holder, int position) {
        // Get the data object for the item view in this position
        Movies thisContact = mContacts.get(position);

        int resID = thisContact.getCover();
        holder.lvCover.setImageResource(resID);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

}