package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adyen.model.notification.NotificationRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class HelloController {

	@PostMapping(path= "/hello")
	public Response hello(NotificationRequest notificationRequest) throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		System.out.println("Events from Adyen: "+mapper.writeValueAsString(notificationRequest));
		
		return new Response("[accepted]") ;
	}
}
