package org.zerock.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test1")
public class Test1Controller {
	
	
	// url:/test1/login, method:post
	@PostMapping("/login") 
	public void login(String id, String pw, HttpSession session) {
		//
		
		session.setAttribute("authUser", "user");
	}
}
