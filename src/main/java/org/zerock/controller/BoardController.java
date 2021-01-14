package org.zerock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
	
	private BoardService service;
	
	/*
	public BoardController(BoardService service) {
		super();
		this.service = service;
	}
	*/

	// 211 page 표
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@GetMapping("/list")
	public void list() {
		service.getList();
	}
	
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@PostMapping("/register")
	public String register() {
		return null;
	}
	
	// 표: /board/read, 코드: /board/get
	@GetMapping("/get")
	public void get() {
		
	}
	
	@PostMapping("/modify")
	public String modify() {
		return null;
	}
	
	@PostMapping("/remove")
	public String remove() {
		return null;
	}
}

// servlet/jsp
// ControllerUsingURI(Servlet) ....properties
//   /list.do -> ListHandler 