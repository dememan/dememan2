package com.deme.movieinfoservice.service;

import com.deme.movieinfoservice.domain.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();

    Movie findById(int id);

    Movie findByName(String name);
}
