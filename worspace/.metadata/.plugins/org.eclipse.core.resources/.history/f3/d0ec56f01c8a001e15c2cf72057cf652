package com.project.sitefilmes.model;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "releaseYear")
	private String releaseYear;

	@Column(name = "resume")
	private String resume;

	@OneToMany(mappedBy = "movie")
	private Collection<Rating> ratings;

	public Movie() {
		super();
	}

	public Movie(String title, String releaseYear, String resume) {
		super();
		this.title = title;
		this.releaseYear = releaseYear;
		this.resume = resume;
	}

	public Movie(Long id, String title, String releaseYear, String resume) {
		super();
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
		this.resume = resume;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

}
