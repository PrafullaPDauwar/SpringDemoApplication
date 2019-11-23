package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	User abcUser = new User("Prafulla", 26, "prafulla@gmail.com");
	
	@Autowired
	NotificationService notificationService;

	@GetMapping("/test")
	public User getMsg() {

		return abcUser;
	}
}
