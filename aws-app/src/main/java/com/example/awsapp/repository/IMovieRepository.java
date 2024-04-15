package com.example.awsapp.repository;

import com.example.awsapp.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovieRepository extends JpaRepository<Movie, Long> {
}
