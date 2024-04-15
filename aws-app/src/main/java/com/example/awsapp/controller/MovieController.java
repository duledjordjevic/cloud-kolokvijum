package com.example.awsapp.controller;

import com.example.awsapp.model.Movie;
import com.example.awsapp.repository.IMovieRepository;
import com.example.awsapp.service.IMovieService;
import com.example.awsapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    private IMovieService movieService;

    @GetMapping
    public List<Movie> getMovies() {
        return movieService.findAll();
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.save(movie);
    }
}
