package com.project.sitefilmes.model.dto;

public class RatingDTO {

	private String text;

	private String date;

	private Integer grade;

	private Long user;

	private String idMovie;

	public RatingDTO() {
		super();
	}

	public RatingDTO(String text, String date, Integer grade, Long user, String idMovie) {
		super();
		this.text = text;
		this.date = date;
		this.grade = grade;
		this.user = user;
		this.idMovie = idMovie;
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

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	public String getIdMovie() {
		return idMovie;
	}

	public void setIdMovie(String idMovie) {
		this.idMovie = idMovie;
	}

}
