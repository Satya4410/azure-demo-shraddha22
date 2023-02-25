package com.example.angular;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	
	@GetMapping("/H")
	public String Hello() {
		return "Hello Azure.........";

	}

	
	@RequestMapping("/azure")
	public String Hello1() {
		return "Hello Azure.........welcome to the dashboard";
	}
}
