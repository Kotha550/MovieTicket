package com.capgemini.moviedto;

import java.time.LocalTime;

//Implementing Pojo/Bean/DTO Class with required attributes and Implementing Setter,getter and to String methods....
public class Show {

	public Show(int theatreId, int showId, String showName, LocalTime showStartTime, LocalTime showEndTime) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showName = showName;
		this.theatreId = theatreId;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	private int theatreId;
	private int showId;
	private LocalTime showStartTime;
	private LocalTime showEndTime;
	private String showName;

	public Show() {
		super();
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public LocalTime getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(LocalTime showStartTime) {
		this.showStartTime = showStartTime;
	}

	public LocalTime getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(LocalTime showEndTime) {
		this.showEndTime = showEndTime;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	@Override
	public String toString() {
		return "Show [theatreId=" + theatreId + ", showId=" + showId + ", showStartTime=" + showStartTime
				+ ", showEndTime=" + showEndTime + ", showName=" + showName + "]";
	}

}
