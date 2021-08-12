package io.java.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@RequestMapping("/")
	private String home() {
		return "welcome user";
		
	}
}
