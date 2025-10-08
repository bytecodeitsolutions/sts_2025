package com.itm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
	@GetMapping("/hello")
	public String greet(){
		return "Good Evening Everyone-from spring boot app";
	}
	
	@GetMapping("/hello1")
	public String greet1(){
		return "Good Afternoon Everyone-from spring boot app";
	}
}
