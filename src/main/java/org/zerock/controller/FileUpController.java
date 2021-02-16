package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/file")
@Log4j
public class FileUpController {

	@GetMapping("/ex1")
	public void form() {
		
	}
	
	@PostMapping("/ex1")
	public String fileup(String name) {
		log.info(name);
		
		return "/file/ex1";
	}
}










