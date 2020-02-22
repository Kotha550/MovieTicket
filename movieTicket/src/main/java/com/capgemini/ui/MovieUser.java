package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.movieService.MovieServiceClass;
import com.capgemini.moviedto.ScreenDetails;

public class MovieUser {
	public static void main(String[] args) {
		MovieServiceClass service = new MovieServiceClass();   //Implementing MovieServiceClass object "service"...
		Scanner sc = new Scanner(System.in);    //Implementing Scanner Class with object "sc"....
		ScreenDetails details = new ScreenDetails(); //Implementing ScreenDetails class object "details"....

		while (true) {  //Taking Input From the user....
			System.out.println("WELCOME TO MOVIE BOOKING SERVICE");
			System.out.println("1.Search Shows by Theatre");
			System.out.println("2.Display All Shows by Theatre");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the Theatre Id");
				int theatreId = sc.nextInt();
				details.setTheatreId(theatreId);
				System.out.println("Enter the Show Id");
				int ShowId = sc.nextInt();
				boolean flag = service.searchShow(theatreId, ShowId);
				if (flag != true) {
					System.err.println("Invalid theatre id or Show Id");
				}
				break;
			case 2:
				System.out.println("Enter The Theatre Id");
				int theatreId1 = sc.nextInt();
				details.setTheatreId(theatreId1);
				boolean flag1 = service.displayShows(details);
				if (flag1 != true) {
					System.err.println("Invalid Theatre Id");
				}
			}
		}

	}

}
