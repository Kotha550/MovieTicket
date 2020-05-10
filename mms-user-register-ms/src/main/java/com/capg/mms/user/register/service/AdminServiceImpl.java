package com.capg.mms.user.register.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.capg.mms.user.register.model.Movie;
import com.capg.mms.user.register.model.Screen;
import com.capg.mms.user.register.model.Show;
import com.capg.mms.user.register.model.Theatre;

public class AdminServiceImpl {
	@Autowired
	RestTemplate rest;
	
//////////////////////////////////////////theatremethods//////////////////////////////////////////
	public Theatre addTheatre(Theatre theatre) {
		
		return rest.postForObject("http://theatre-ms/theatres/add", theatre, Theatre.class);
	}
	
	public Theatre updateTheatre(Theatre theatre) throws RestClientException, URISyntaxException {
		//Theatre t= rt.postForObject("http://theatre-ms/theatres/add", theatre, Theatre.class);
		if(theatre != null) {
			rest.put(new URI("http://theatre-ms/theatres/update"),theatre);
		}
		 return theatre;
	}

	
	public List<Theatre>findAllTheatres() {
		Theatre[] theatreList=rest.getForObject("http://theatre-ms/theatres/all", Theatre[].class);
	return (List<Theatre>) Arrays.asList(theatreList);
	}

	
	public void deleteTheatreById(int theatreId) {
	
		rest.delete("http://theatre-ms/theatres/delete/id/"+theatreId, theatreId);
	}

	

	
	
//	//////////////////////////////////show methods//////////////////////////////////////////////////////
//	
	public Show addShow(Show show) {
		
		return rest.postForObject("http://theatre-ms/show/add", show, Show.class);
	}
	
	
	public void deleteShowById(int showId) {
		
		 rest.delete("http://theatre-ms/theatres/show/delete/id/"+showId,showId);
	}
	
	
	public Show updateShowById(Show show) {
		Show shows=rest.postForObject("http://theatre-ms/show/add", show, Show.class);
		rest.put("http://theatre-ms/theatres/show/update", shows,shows);
		return shows;
	}

	
	public List<Show> findAllShows() {
		List<Show> showList=(List<Show>) rest.getForObject("http://theatre-ms/show/all", Show.class);
		return showList;
	}
//	
//	///////////////////////////////////////////Screen methods/////////////////////////////////////////////////////
	
	public Screen addScreen(Screen screen) {
		
		return rest.postForObject("http://theatre-ms/screen/add", screen, Screen.class);
	}
	
	public void deleteScreenById(int screenId) {
		
		 rest.delete("http://theatre-ms/screen/delete/id/"+screenId, screenId);
	}

	
	public Screen updateScreenById(Screen screen) {
	Screen s=rest.postForObject("http://theatre-ms/screen/add", screen, Screen.class);
	rest.put("http://theatre-ms/theatres/screen/update",s,s);
		return s;
	}

	
	public List<Screen> findAllScreens() {
		
		Screen screenList= rest.getForObject("http://theatre-ms/screen/all", Screen.class);
		return (List<Screen>) screenList;
	}
	
//	////////////////////////////////////////////Movie methods///////////////////////////////////////////////////////////
//	
//	
	
	public Movie addMovie(Movie movie) {
		
		return rest.postForObject("http://movie-ms/movie/add", movie, Movie.class);
	}
	
	public void deleteMovieById(int movieId) {
		
		rest.delete("http://movie-ms/movie/delete/id/"+movieId,movieId);
		
	}
	
	public Movie updateMovie(Movie movie) {
		Movie m=rest.postForObject("http://movie-ms/movie/add", movie, Movie.class);
		rest.put("http://movie-ms/movies/update", m,m);
		return m;
	}
	
	public Movie getMovieById(int movieId) {
		Movie movie=rest.getForObject("http://movie-ms/movie/get/id/"+movieId, Movie.class);
		
		return movie;
	}

	



	


}
