package org.zerock.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test2")
public class Test2Controller {

	@RequestMapping("/qna")
	public void qna(HttpSession session) {
		Object o = session.getAttribute("authUser");
		if (o == null) {
			
		} else {
			
		}
	}
	
	@RequestMapping("/write")
	public String write(HttpSession session) {
		Object o = session.getAttribute("authUser");
		if (o == null) {
			return "redirect:/test1/login";
		} else {
			return "write";
		}
	}
	
	@RequestMapping("/write")
	public String write(@SessionAttribute("authUser") User user) {
		
		if (user == null) {
			return "redirect:/test1/login";
		} else {
			return "write";
		}
	}
}
