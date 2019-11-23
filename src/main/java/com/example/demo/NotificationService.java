package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	@Value("${email.username}")
	private String username;
	
	@Value("${email.password}")
	private String password;
	
	@Value("${email.provider}")
	private String provider;
	
	@Value("${email.port}")
	private String port;
	
	
	public void sending(String email, String msgBody) {
		System.out.println("Admin Notifiaction" + email);
	}
}
