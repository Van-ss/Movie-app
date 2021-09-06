package com.example.movies;


import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;


import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import java.util.ArrayList;

import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    Context context;
    ArrayList<Movies> aMovies;
    RecyclerView recyclerview;
    RecyclerViewAdaptor adapter;
    SwipeRefreshLayout swipeRefreshLayout;
    // Declare Variables
    View.OnClickListener actionButtonHandler = new View.OnClickListener() {//Buttons to open List view for Each Activity
        public void onClick(View v) {
            Intent listActivity= new Intent(getBaseContext(), ListActivity.class);
            listActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            listActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            listActivity.putExtra("MessageFromMainActivity", "Action");
            startActivity(listActivity);
            overridePendingTransition(R.anim.slide_in_from_left,R.anim.fade_out);
        }
    };
    View.OnClickListener thrillerButtonHandler = new View.OnClickListener() {
        public void onClick(View v) {
            Intent listActivity= new Intent(getBaseContext(), ListActivity.class);
            listActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            listActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            listActivity.putExtra("MessageFromMainActivity", "Thriller");
            startActivity(listActivity);
            overridePendingTransition(R.anim.slide_in_from_left,R.anim.fade_out);
        }
    };
    View.OnClickListener scifiButtonHandler = new View.OnClickListener() {
        public void onClick(View v) {
            Intent listActivity= new Intent(getBaseContext(), ListActivity.class);
            listActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            listActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            listActivity.putExtra("MessageFromMainActivity", "Sci-Fi");
            startActivity(listActivity);
            overridePendingTransition(R.anim.slide_in_from_left,R.anim.fade_out);
        }
    };
    View.OnClickListener comedyButtonHandler = new View.OnClickListener() {
        public void onClick(View v) {
            Intent listActivity= new Intent(getBaseContext(), ListActivity.class);
            listActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            listActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            listActivity.putExtra("MessageFromMainActivity", "Comedy");
            startActivity(listActivity);
            overridePendingTransition(R.anim.slide_in_from_left,R.anim.fade_out);

        }
    };
    View.OnClickListener romanceButtonHandler = new View.OnClickListener() {
        public void onClick(View v) {
            Intent listActivity= new Intent(getBaseContext(), ListActivity.class);
            listActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            listActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            listActivity.putExtra("MessageFromMainActivity", "Romance");
            startActivity(listActivity);
            overridePendingTransition(R.anim.slide_in_from_left,R.anim.fade_out);

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Movies);
        super.onCreate(savedInstanceState);
        context = MainActivity.this;
        setContentView(R.layout.activity_main);
        swipeRefreshLayout = findViewById(R.id.swipeRefresher);//Sets Card Views As Buttons for Each Activity
        CardView actionButton = (CardView) findViewById(R.id.action_button);
        actionButton.setOnClickListener(actionButtonHandler);
        CardView thrillerButton = (CardView) findViewById(R.id.thriller_button);
        thrillerButton.setOnClickListener(thrillerButtonHandler);
        CardView scifiButton = (CardView) findViewById(R.id.scifi_button);
        scifiButton.setOnClickListener(scifiButtonHandler);
        CardView comedyButton = (CardView) findViewById(R.id.comedy_button);
        comedyButton.setOnClickListener(comedyButtonHandler);
        CardView romanceButton = (CardView) findViewById(R.id.romance_button);
        romanceButton.setOnClickListener(romanceButtonHandler);
        //setting action bar title
        getSupportActionBar().setTitle("Home");
        recyclerview = (RecyclerView) findViewById(R.id.recycler_topPicks);
        // Initialize contacts
        aMovies = new ArrayList<Movies>();
        aMovies = DataProvider.topPicks();


        // Create adapter passing in the sample user data
        adapter = new RecyclerViewAdaptor(aMovies);//Recycler View for top Picks
        // Attach the adapter to the recyclerview to populate items
        recyclerview.setAdapter(adapter);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {//Refreshes Top Picks when Pages Refreshed
            @Override
            public void onRefresh() {
                aMovies.clear();
                aMovies.addAll(DataProvider.topPicks());
                swipeRefreshLayout.setRefreshing(false);
                adapter.notifyDataSetChanged();
            }
        });



        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        // Fore a Horizontal RecyclerView use
        // Set layout manager to position the items
        recyclerview.setLayoutManager(lm);



    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        // We inflate the menu and add search items to the list
        getMenuInflater().inflate(R.menu.menu_movie_list,menu);
        final MenuItem searchItem = menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setIconified(true);
                Intent searchIntent = new Intent(getBaseContext(), SearchableActivity.class);
                searchIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                searchIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(searchIntent);//When Search Icon Clicked Takes us to Search View
                overridePendingTransition(R.anim.slide_in_from_left,R.anim.fade_out);//Add Animations
            }
        });
        return true;
    }
}