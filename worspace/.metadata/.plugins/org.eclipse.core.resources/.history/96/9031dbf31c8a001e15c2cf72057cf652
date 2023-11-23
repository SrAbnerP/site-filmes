package com.project.sitefilmes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "text")
	private String text;

	@Column(name = "date")
	private String date;

	@Column(name = "grade")
	private Integer grade;

	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;

	@ManyToOne
	@JoinColumn(name = "id_movie")
	private Movie movie;

	public Rating() {
		super();
	}

	public Rating(String text, String date, Integer grade) {
		super();
		this.text = text;
		this.date = date;
		this.grade = grade;
	}

	public Rating(Long id, String text, String date, Integer grade) {
		super();
		this.id = id;
		this.text = text;
		this.date = date;
		this.grade = grade;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

}
