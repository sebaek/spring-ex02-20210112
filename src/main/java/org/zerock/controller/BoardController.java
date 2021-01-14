package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	// 211 page 표
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@GetMapping("/list")
	public void list() {
		
	}
	
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@PostMapping("/register")
	public String register() {
		return null;
	}
	
	// 표: /board/read, 코드: /board/get
	public void get() {
		
	}
	
	
	public String modify() {
		return null;
	}
	
	
	public String remove() {
		return null;
	}
}

// servlet/jsp
// ControllerUsingURI(Servlet) ....properties
//   /list.do -> ListHandler 