package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.net.Uri;


public class MovieDetailActivity extends AppCompatActivity {
    private ImageView ivMovieCover;
    private TextView tvNames;
    private TextView tvDirector;
    private TextView tvGenre;
    private TextView tvYear;
    private TextView tvPrice;
    private TextView ivDescription;
    private String movieTrailer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        ivMovieCover = (ImageView) findViewById(R.id.ivMovieCover);
        tvNames = (TextView) findViewById(R.id.tvName);
        tvDirector = (TextView) findViewById(R.id.tvDirector);
        tvGenre = (TextView) findViewById(R.id.tvGenre);
        tvYear = (TextView) findViewById(R.id.tvYear);
        tvPrice = (TextView) findViewById(R.id.tvPrice);
        ivDescription= (TextView) findViewById(R.id.textView) ;
        Button bButton=(Button)findViewById(R.id.Button);
        bButton.setOnClickListener(TrailerButtonHandler);


        Intent thisIntent = getIntent();
        // Use the Movie to populate the data into our views
        Movies movie = (Movies) thisIntent.getSerializableExtra("Movies");
        loadMovie(movie);
        ViewPager ivImageSlider = (ViewPager) findViewById(R.id.ivImageSlider);
        ivImageSlider.setAdapter(new ImageAdapter(MovieDetailActivity.this, movie));
    }

    private void loadMovie(Movies movie) {

        tvNames.setText(movie.getMovieName());
        tvDirector.setText(movie.getDirector());
        tvGenre.setText(movie.getGenre());
        tvYear.setText(movie.getYear());
        ivDescription.setText(movie.getMovieDescription());
        tvPrice.setText(movie.getPrice());
        movieTrailer= movie.getTrailer();
        int resID = movie.getCover();
        ivMovieCover.setImageResource(resID);

        DataProvider.topPicks(movie.getId());
    }
    View.OnClickListener TrailerButtonHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(movieTrailer));//When bButton clicked takes to Trailer URL
            startActivity(intent);
        }
    };
}