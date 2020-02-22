package com.capgemini.movieService;

import com.capgemini.moviedao.MovieDAO;
import com.capgemini.moviedto.ScreenDetails;

public class MovieServiceClass implements MovieService {
	MovieDAO dao = new MovieDAO();

	public boolean searchShow(int theatreId, int ShowId) { // Implementing search Show method with required
															// validations..

		boolean flag = false;
		if (isValidtheatreId(theatreId) && isValidshowId(ShowId)) {
			flag = true;
			flag = dao.searchShow(theatreId, ShowId);
		}
		return flag;

	}

	public boolean displayShows(ScreenDetails sd) {// Implementing display Show method with required validations..

		return dao.displayShows(sd);
	}

	public static boolean isValidtheatreId(int theaterId) {
		boolean flag = false;
		String str = theaterId + "";
		if (str.matches("[2][0-9]{3,}")) {
			flag = true;
		}
		if (flag == false) {//
			try {
				throw new Exception("Theater Id Must be minimum of 4 digits starting with 2");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return flag;
	}

	public static boolean isValidshowId(int showId1) {
		boolean flag = false;
		String showId = showId1 + "";
		if (showId.matches("[0-8]{7}[0-5]")) {
			flag = true;
		}
		if (flag == false) {
			try {
				throw new Exception("Show Id Must be 8 digits and last digit must be 0-5");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return flag;
	}

	public void displayShows(int i) {
		// TODO Auto-generated method stub

	}

}
