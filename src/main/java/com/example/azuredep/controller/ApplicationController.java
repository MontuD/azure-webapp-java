package com.example.azuredep.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import AppResponse.CustomResponse;

@Controller
public class ApplicationController {

	
	@GetMapping("/hello")
	@ResponseBody
	public  CustomResponse<String> getHelloMessage() {
		
		CustomResponse<String> customResponse = new CustomResponse<String>();
		
	
		customResponse.setResponseCode(Response.SC_OK);
		customResponse.setMessage("Hello World");
		
		
		return customResponse;
	}
	
	
	
	@GetMapping("/users")
	@ResponseBody
	public CustomResponse<List<String>> getUsers() {
		
		List<String> users = Arrays.asList("Montu", "Sonu","Rahul","Deepak");
		CustomResponse<List<String>> customResponse = new CustomResponse<List<String>>();

		
		customResponse.setMessage(users);
		customResponse.setResponseCode(Response.SC_OK);
		
		return customResponse ;
	}

}
