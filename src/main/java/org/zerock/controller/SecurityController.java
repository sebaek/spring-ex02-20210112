package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sec")
@Log4j
public class SecurityController {
	
	@GetMapping("/all")
	public void all() {
		log.info("all");
	}
	
	@GetMapping("/member")
	public void member() {
		log.info("member");
	}
	
	@GetMapping("/admin")
	public void admin() {
		log.info("admin");
	}
}
