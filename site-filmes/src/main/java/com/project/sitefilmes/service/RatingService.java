package com.project.sitefilmes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.sitefilmes.model.Rating;

@Service
public interface RatingService {

	Rating save(Rating rating);

	Rating update(Rating rating);

	void delete(Rating rating);

	void validate(Rating rating);

	List<Rating> getToIdMovie(Long id);
}
