package com.capg.mms.theatre;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.capg.mms.theatre.exception.TheatreException;
import com.capg.mms.theatre.service.ScreenServiceImpl;
import com.capg.mms.theatre.service.ShowServiceImpl;
import com.capg.mms.theatre.service.TheatreServiceImpl;

@SpringBootTest
class MmsTheatreMsApplicationTests {
	@Autowired
	ScreenServiceImpl screenService;
	@Autowired
	TheatreServiceImpl theatreService;
	@Autowired
	ShowServiceImpl showService;
	@Test
	public void testvalidateTheatreId(int theatreId)throws TheatreException{
		assertFalse(theatreService.validateTheatreId(234567));
		
		
	}


}
