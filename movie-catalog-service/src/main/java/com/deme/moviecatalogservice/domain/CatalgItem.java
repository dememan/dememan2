package com.deme.moviecatalogservice.domain;

public class CatalgItem {

    private int movieId;
    private String movieName;
    private int movieRating;

    public CatalgItem() {
    }

    public CatalgItem(int movieId, String movieName, int movieRating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieRating = movieRating;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }
}
