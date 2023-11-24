package com.project.sitefilmes.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.sitefilmes.model.dto.MovieDTO;
import com.project.sitefilmes.service.TmdbApiService;

@Service
public class TmdbApiServiceImpl implements TmdbApiService {

	@Value("${tmdb.api.key}")
	private String apiKey;

	private final RestTemplate restTemplate;

	public TmdbApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public MovieDTO getMovieById(String movieId) {

		String apiUrl = "https://api.themoviedb.org/3/movie/{movieId}?api_key=" + apiKey;

		return restTemplate.getForObject(apiUrl, MovieDTO.class, movieId);
	}

	@Override
	public String getRandomMovies(int pageSize) {
		String apiUrl = "https://api.themoviedb.org/3/discover/movie" + "?api_key=" + apiKey + "&language=en-US"
				+ "&sort_by=popularity.desc" + "&include_adult=false" + "&include_video=false" + "&page=1"
				+ "&vote_count.gte=1000" + "&page_size=" + pageSize;

		return restTemplate.getForObject(apiUrl, String.class);
	}

	@Override
	public String getActionMovies(int genres, int pageSize) {
		String apiUrl = "https://api.themoviedb.org/3/discover/movie" + "?api_key=" + apiKey + "&language=en-US"
				+ "&sort_by=popularity.desc" + "&include_adult=false" + "&include_video=false" + "&with_genres="
				+ genres + "&page=1" + "&vote_count.gte=1000" + "&page_size=" + pageSize;

		return restTemplate.getForObject(apiUrl, String.class);
	}

	@Override
	public String searchMoviesByName(String query) {
		String apiUrl = "https://api.themoviedb.org/3/search/movie" + "?api_key=" + apiKey + "&language=en-US"
				+ "&query=" + query + "&include_adult=false";
		return restTemplate.getForObject(apiUrl, String.class);
	}

}
