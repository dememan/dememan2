package com.deme.movieinfoservice.service;

import com.deme.movieinfoservice.domain.Movie;
import com.deme.movieinfoservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements  MovieService{

    @Autowired
    MovieRepository repository;
    @Override
    public List<Movie> findAll() {
        return repository.findAll();
    }

    @Override
    public Movie findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Movie findByName(String name) {
        return repository.findByName(name);
    }
}
