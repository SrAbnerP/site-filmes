package com.project.sitefilmes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.sitefilmes.model.dto.MovieDTO;

@Service
public interface TmdbApiService {

	MovieDTO getMovieById(String movieId);

	List<MovieDTO> getRandomMovies(int pageSize);

	List<MovieDTO> getActionMovies(String genres, int pageSize);

	List<MovieDTO> searchMoviesByName(String query);
}
