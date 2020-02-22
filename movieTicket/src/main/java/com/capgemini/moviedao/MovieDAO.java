package com.capgemini.moviedao;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;

import com.capgemini.moviedto.ScreenDetails;
import com.capgemini.moviedto.Show;

public class MovieDAO implements IMovieDAO {
//Creating HashMap with with theater Id as key and Details of Show as Hashset in value..
	static Map<Integer, HashSet<Show>> map = new HashMap<Integer, HashSet<Show>>();

	// Show d = new Show();
	ScreenDetails screen = new ScreenDetails();

	public Map<Integer, HashSet<Show>> getMap() {
		//
		return map;
	}

	public void setMap(Map<Integer, HashSet<Show>> map) {
		this.map = map;
	}

	static {//Entering The Static details of required values... 

		HashSet<Show> hs = new HashSet<Show>();
		hs.add(new Show(23456, 87654320, "Morning Show", LocalTime.of(9, 15, 00), LocalTime.of(12, 15, 00)));
		hs.add(new Show(23456, 87654321, "afternoon Show", LocalTime.of(1, 15, 00), LocalTime.of(3, 15, 00)));
		map.put(23456, hs);
		HashSet<Show> hs1 = new HashSet<Show>();
		hs1.add(new Show(23457, 87654322, "First Show", LocalTime.of(18, 15, 00), LocalTime.of(21, 15, 00)));
		hs1.add(new Show(23457, 87654323, "Second Show", LocalTime.of(20, 15, 00), LocalTime.of(23, 15, 00)));
		map.put(23457, hs1);
		HashSet<Show> hs2 = new HashSet<Show>();
		hs2.add(new Show(23458, 87654324, "Matniee Show", LocalTime.of(14, 15, 00), LocalTime.of(17, 15, 00)));
		hs2.add(new Show(23458, 87654325, "First Show", LocalTime.of(18, 15, 00), LocalTime.of(21, 15, 00)));
		map.put(23458, hs2);
	}
	public boolean flag = false;

	public boolean searchShow(int theatreId, int ShowId) {//Search Show method implementation..  

		HashSet<Show> set = map.get(theatreId); //
		if (set == null) {
			flag = false;//
		} else {
			for (Show i : set) {
				if (i.getShowId() == ShowId) {
					System.out.println(i);
					flag = true;
				}
			}
		}
		return flag;

	}

	public boolean displayShows(ScreenDetails sd) {//Display show method implementation..
		for (Integer i : map.keySet()) {
			if (i == sd.getTheatreId()) {
				flag = true;
				System.out.println(map.get(i));
			}
		}
		return flag;
	}

}
