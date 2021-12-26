package com.deme.movieinfoservice.repository;

import com.deme.movieinfoservice.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

    @Override
    List<Movie> findAll();

    @Override
    Optional<Movie> findById(Integer integer);

    Movie findByName(String name);
}
