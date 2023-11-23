package com.project.sitefilmes.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sitefilmes.model.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {

	List<Rating> findByIdMovie(Long id);
}
