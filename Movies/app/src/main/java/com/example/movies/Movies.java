package com.example.movies;

import java.io.Serializable;


public class Movies implements Serializable {
    private final int id;
    private final String movieName;
    String price;
    private final String genre;
    private final String director;
    private final int[] images;
    private final int actionCover;
    private final String movieDescription;
    private final String year;
    private final String trailer;

    public Movies(int id, String movieName, String price, String genre,int actionCover, String movieDescription, String director, String year,int[]images,String trailer){
        this.id = id;
        this.movieName = movieName;
        this.price = price;
        this.genre = genre;
        this.director = director;
        this.actionCover = actionCover;
        this.movieDescription = movieDescription;
        this.year = year;
        this.images=images;
        this.trailer=trailer;
    }

    public String getMovieName() {return movieName;}

    public int getId() {
        return id;
    }

    public String getPrice() {
        int year=Integer.parseInt(getYear());//sets Movie Prices based on year released
        if (year<=2000) {
            return price="$5.99";
        }
        else if(year<2016 & year>2001){
            return price="$9.99";
        }
        else{
            return price="$14.99";
        }
    }

    public int[] getImages() { return images;}

    public String getGenre() {
        return genre;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public String getDirector() {
        return director;
    }

    public String getYear(){
        return year;
    }

    public int getCover(){
        return actionCover;
    }

    public String getTrailer(){
        return trailer;
    }
}


