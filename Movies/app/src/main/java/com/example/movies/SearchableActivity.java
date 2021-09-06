package com.example.movies;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;


public class SearchableActivity extends AppCompatActivity  {

    MovieAdapter movieAdapter;
    ListView    lvMovies;
    TextView NoResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        

        lvMovies = (ListView) findViewById(R.id.lvMovies);
        NoResult = (TextView) findViewById(R.id.noResult);
        NoResult.setVisibility(View.INVISIBLE);
        setTitle("");
        //Preloads all movies in search activity
        ArrayList<Movies> aMovies = new ArrayList<>();
        aMovies = DataProvider.searchFunction();

        movieAdapter = new MovieAdapter(this,aMovies);
        lvMovies.setAdapter(movieAdapter);


        setupMovieSelectedListener();
    }
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        // We inflate the menu and add search items to the list
        getMenuInflater().inflate(R.menu.menu_movie_list, menu);
        final MenuItem searchItem = menu.findItem(R.id.action_search);
        final androidx.appcompat.widget.SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.onActionViewExpanded();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {//When Text changes in Search View, Movies tailor to Search
                ArrayList<Movies> filteredMovies = new ArrayList<Movies>();
                for (Movies movies: DataProvider.searchFunction()){
                    if (movies.getMovieName().toLowerCase().contains(newText.toLowerCase())){
                        filteredMovies.add(movies);
                    }
                }
                if (filteredMovies.isEmpty()){
                    NoResult.setVisibility(View.VISIBLE); //When no Movies, then no result is Visible
                }else
                    NoResult.setVisibility(View.INVISIBLE);//When Movies are Displayed, No Result is invisible

                movieAdapter = new MovieAdapter(getApplicationContext(),filteredMovies);
                lvMovies.setAdapter(movieAdapter);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
    public void setupMovieSelectedListener() { //opens up movie detail activity
        lvMovies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Launch the detail view passing Movie as an extra
                Intent intent = new Intent(getBaseContext(), MovieDetailActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("Movies", movieAdapter.getItem(position));//When Movie clicked Takes to details View
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_from_left,R.anim.fade_out);
            }
        });
    }
}
