package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;


import com.adyen.model.notification.NotificationRequest;

@RestController
public class HelloController {


	@PostMapping(path= "/hello")
	public Response hello(@RequestHeader Map<String, String> headers,@RequestBody NotificationRequest notificationRequest){
		 
		 System.out.println(notificationRequest);
		
		headers.forEach((key, value) -> {
        System.out.println(String.format("Header '%s' = %s", key, value));
    });
		 
		 //System.out.println("Event Code:"+notificationRequest.getNotificationItems().get(0).getEventCode());

		
		return new Response("[accepted]") ;
	}
	
	@GetMapping(path= "/helloWorld")
	public String helloWorld(){
		return "sample" ;
	}
}
