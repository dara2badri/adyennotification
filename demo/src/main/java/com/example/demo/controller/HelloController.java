package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adyen.model.notification.NotificationRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

@RestController
public class HelloController {

	@PostMapping(path= "/hello")
	public Response hello(NotificationRequest notificationRequest) throws JsonProcessingException {
		
		 Gson gson = new Gson();
		 String json = gson.toJson(notificationRequest);
		 System.out.println("JSON:"+json);
		 System.out.println("Normal:"+notificationRequest);
		
		return new Response("[accepted]") ;
	}
}
