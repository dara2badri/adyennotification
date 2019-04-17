package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adyen.model.notification.NotificationRequest;

@RestController
public class HelloController {

	@PostMapping(path= "/hello")
	public Response hello(NotificationRequest notificationRequest){
		 
		 System.out.println(notificationRequest);
		 
		 //System.out.println("Event Code:"+notificationRequest.getNotificationItems().get(0).getEventCode());

		
		return new Response("[accepted]") ;
	}
}
