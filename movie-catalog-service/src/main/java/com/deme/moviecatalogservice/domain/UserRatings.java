package com.deme.moviecatalogservice.domain;

import java.util.List;

public class UserRatings {

    private int id;
    private String username;

    List<Rating> ratings;

    public UserRatings() {
    }

    public UserRatings(int id, String username, List<Rating> ratings) {
        this.id = id;
        this.username = username;
        this.ratings = ratings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
