package com.example.awsapp.service;

import com.example.awsapp.model.Movie;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IMovieService {
    List<Movie> findAll();
    Movie save(Movie movie);
}
