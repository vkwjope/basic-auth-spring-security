package com.example.basicauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAuthResource {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

}
