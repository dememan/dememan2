package com.deme.movieinfoservice.controller;

import com.deme.movieinfoservice.domain.Movie;
import com.deme.movieinfoservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService service;
    @GetMapping()
    public List<Movie> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Movie findByID(@PathVariable int id) {
        return service.findById(id);
    }

    @PutMapping("/{name}")
    public Movie findByName(@PathVariable("name") String name) {
        return service.findByName(name);
    }
}
