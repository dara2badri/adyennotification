package com.example.demo.controller;

public class Response {
	
	private String notificationResponse;

	public String getNotificationResponse() {
		return notificationResponse;
	}

	public void setNotificationResponse(String notificationResponse) {
		this.notificationResponse = notificationResponse;
	}
	
	public Response(String notificationResponse){
		this.notificationResponse = notificationResponse;
	}
	
}
