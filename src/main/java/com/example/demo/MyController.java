package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	User abcUser = new User("Prafulla", 26, "prafulla@gmail.com");

	@GetMapping("/test")
	public User getMsg() {
		return abcUser;
	}
}
