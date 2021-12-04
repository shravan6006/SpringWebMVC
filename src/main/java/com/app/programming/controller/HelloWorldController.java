package com.app.programming.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/greet")
	public String greet() {
		String msg="Hello EveryOne Good Evening and Welcome";
		return msg;
	}

}
