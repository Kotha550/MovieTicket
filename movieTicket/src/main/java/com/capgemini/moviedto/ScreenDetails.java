package com.capgemini.moviedto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScreenDetails {
	//Implementing Pojo/Bean/DTO Class with required attributes and Implementing Setter,getter and to String methods....
	private int screenId;
	private String screenName;
	private int theatreId;
	private Date LocalDate;
	private int row;
	private int coloumn;
	private List<Show> ShowList = new ArrayList<Show>();

	public List<Show> getShowList() {
		return ShowList;
	}

	public void setShowList(List<Show> showList) {
		ShowList = showList;
	}

	

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColoumn() {
		return coloumn;
	}

	public void setColoumn(int coloumn) {
		this.coloumn = coloumn;
	}

	// Show show=new Show();
	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public Date getLocalDate() {
		return LocalDate;
	}

	public void setLocalDate(Date localDate) {
		LocalDate = localDate;
	}

	@Override
	public String toString() {
		return "ScreenDetails [screenId=" + screenId + ", screenName=" + screenName + ", theatreId=" + theatreId
				+ ", LocalDate=" + LocalDate + ", row=" + row + ", coloumn=" + coloumn + ", ShowList=" + ShowList + "]";
	}

}
