package com.project.sitefilmes.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.sitefilmes.model.Movie;
import com.project.sitefilmes.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Override
	@Transactional
	public Movie save(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Movie movie) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Movie> find(Movie movieFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
