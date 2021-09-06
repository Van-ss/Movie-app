package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;


public class ListActivity extends AppCompatActivity {
    ListView lvMovies;
    MovieAdapter movieAdapter;
    ArrayList<Movies> aMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent thisIntent = getIntent();
        String message = thisIntent.getStringExtra("MessageFromMainActivity");
        TextView tvGenreHeader=findViewById(R.id.tvGenreHeader);//Gets Genre from Button clicked
        tvGenreHeader.setText(message);
        ArrayList<Movies> aMovies = new ArrayList<>();
        lvMovies = (ListView) findViewById(R.id.lvMovies);//Finds Movies in Genre
        aMovies = DataProvider.generateDataNew(message);


        movieAdapter = new MovieAdapter(this, aMovies);
        lvMovies.setAdapter(movieAdapter);


        setupMovieSelectedListener();


   }
    public void setupMovieSelectedListener() {
        lvMovies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Launch the detail view passing book as an extra
                Intent intent = new Intent(getBaseContext(), MovieDetailActivity.class);//When Movie is clicked opens Details Activity
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("Movies", movieAdapter.getItem(position));
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_from_left,R.anim.fade_out);//Animations Added
            }
        });
    }


}