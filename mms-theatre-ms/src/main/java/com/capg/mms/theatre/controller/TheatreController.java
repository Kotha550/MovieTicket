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

import com.capg.mms.theatre.model.Theatre;
import com.capg.mms.theatre.service.TheatreServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/theatre")
public class TheatreController {

	@Autowired
	TheatreServiceImpl theatreService;

	@GetMapping("/all")
	public List<Theatre> findAllTheatres() {

		return theatreService.findAllTheatres();

	}

	@PostMapping("/add")
	public Theatre addTheatre(@RequestBody Theatre theatre) {
		if (theatreService.validateTheatreId(theatre.getTheatreId())) {
			Theatre theatre1 = theatreService.addTheatre(theatre);
			theatre = theatre1;

		}
		return theatre;
	}

	@PutMapping("/update")
	public Theatre updateTheaterById(@RequestBody Theatre theatre) {

		return theatreService.updateTheatre(theatre);

	}

	@DeleteMapping("/delete/id/{id}")
	public void deleteTheatreById(@PathVariable("id") Integer theatreId) {
		theatreService.deleteTheatreById(theatreId);

	}

}
