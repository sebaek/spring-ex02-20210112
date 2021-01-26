package org.zerock.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.Ticket;

import lombok.extern.log4j.Log4j;

@RestController
@Log4j
@RequestMapping("/sample")
public class SampleController {
	
	@PostMapping("/ticket")
	public Ticket conver(@RequestBody Ticket ticket) {
		log.info(ticket);
		
		return ticket;
	}
}




