package com.example.awsapp.service;

import com.example.awsapp.model.Movie;
import com.example.awsapp.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MovieService implements IMovieService{

    @Autowired
    private IMovieRepository movieRepository;

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> findAll() { return movieRepository.findAll();}
}
