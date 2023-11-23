package com.project.sitefilmes.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.sitefilmes.model.Movie;
import com.project.sitefilmes.model.repository.MovieRepository;
import com.project.sitefilmes.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository repository;

	@Override
	@Transactional
	public Movie save(Movie movie) {

		Optional<Movie> findMovie = repository.findByTitle(movie.getTitle());

		if (findMovie.isPresent()) {

			return findMovie.get();
		} else {

			return repository.save(movie);
		}

	}

	@Override
	@Transactional
	public void delete(Movie movie) {

		repository.delete(movie);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Movie> find(Movie movieFilter) {

		Example<Movie> example = Example.of(movieFilter,
				ExampleMatcher.matching().withIgnoreCase().withStringMatcher(StringMatcher.CONTAINING));
		return repository.findAll(example);
	}

}
