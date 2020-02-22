package com.capgemini.movieTicket;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import com.capgemini.movieService.MovieServiceClass;

public class MovieTest {
	static MovieServiceClass serviceObject;

	@BeforeAll
	public static void setUp() {
		serviceObject = new MovieServiceClass();
	}

	@Test
	public void testSearchShow() {
		serviceObject = new MovieServiceClass();
		boolean flag = serviceObject.searchShow(23456, 87654321);
		assertEquals(true, flag);

	}
	

	@Test
	public void testIsValidshowId() {
		boolean flag = MovieServiceClass.isValidshowId(87654321);
		assertEquals(true, flag);
	}

}