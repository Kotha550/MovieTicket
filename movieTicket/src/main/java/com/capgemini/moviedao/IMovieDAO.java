package com.capgemini.moviedao;

import com.capgemini.moviedto.ScreenDetails;

public interface IMovieDAO {
	public boolean searchShow(int theatreId, int showId);//Declaring Search show method ...

	public boolean displayShows(ScreenDetails sd);//Declaring Display show method...

}
