package com.capg.mms.theatre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.mms.theatre.model.Show;
import com.capg.mms.theatre.service.ShowServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/show")
public class ShowController {

	@Autowired
	ShowServiceImpl showService;

	@GetMapping("/all")
	public List<Show> findAllShows() {
		return showService.findAllShows();

	}

	@PostMapping("/add")
	public Show addShow(@RequestBody Show show) {
		if (showService.validateShowId(show.getShowId())) {
			Show show1 = showService.addShow(show);
			show = show1;
		}
		return show;
	}

	@PutMapping("/update")
	public Show updateTheShowById(@RequestBody Show show) {

		return showService.updateShowById(show);
	}

	@DeleteMapping("/delete/id/{id}")
	public void deleteShowById(@PathVariable("id") Integer showId) {

		showService.deleteShowById(showId);

	}
}
