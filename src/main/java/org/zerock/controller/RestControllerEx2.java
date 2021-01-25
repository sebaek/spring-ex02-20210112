package org.zerock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest2")
public class RestControllerEx2 {

	@RequestMapping("/ex1")
	public String method1() {
		return "hello";
	}
}
