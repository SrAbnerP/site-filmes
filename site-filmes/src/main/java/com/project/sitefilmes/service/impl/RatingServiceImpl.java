package com.project.sitefilmes.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.sitefilmes.exception.BusinessRuleException;
import com.project.sitefilmes.model.Rating;
import com.project.sitefilmes.model.repository.RatingRepository;
import com.project.sitefilmes.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	RatingRepository repository;

	@Override
	@Transactional
	public Rating save(Rating rating) {

		validate(rating);

		return repository.save(rating);
	}

	@Override
	@Transactional
	public Rating update(Rating rating) {

		Objects.requireNonNull(rating.getId());
		validate(rating);

		return repository.save(rating);
	}

	@Override
	public void validate(Rating rating) {
		if (rating.getText() == null || rating.getText().trim().equals("")) {
			throw new BusinessRuleException("Informe um Comentario válido.");
		}

		if (rating.getGrade() == null || rating.getGrade() < 1 || rating.getGrade() > 5) {
			throw new BusinessRuleException("Informe uma Avaliação válida.");
		}
	}

	@Override
	@Transactional
	public void delete(Rating rating) {

		repository.delete(rating);
	}

	@Override
	public List<Rating> getByIdMovie(String id) {

		List<Rating> ratings = repository.findByIdMovie(id);

		return ratings;
	}

	@Override
	public Optional<Rating> getById(Long id) {

		return repository.findById(id);
	}

}
