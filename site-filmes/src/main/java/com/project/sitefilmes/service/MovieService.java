package com.project.sitefilmes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.sitefilmes.model.Movie;

@Service
public interface MovieService {

	Movie save(Movie movie);

	void delete(Movie movie);

	List<Movie> find(Movie movieFilter);
}
