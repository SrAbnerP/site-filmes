package com.project.sitefilmes.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.sitefilmes.model.Rating;
import com.project.sitefilmes.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Override
	@Transactional
	public Rating save(Rating rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rating update(Rating rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Rating rating) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Rating> getToIdMovie(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
