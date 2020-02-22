package com.capgemini.movieService;

import com.capgemini.moviedto.ScreenDetails;

public interface MovieService {
	public boolean searchShow(int theatreId, int ShowId);// Declaring Search show method ...

	public boolean displayShows(ScreenDetails sd);// Declaring Display show method...

}
