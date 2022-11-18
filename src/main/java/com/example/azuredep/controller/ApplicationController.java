package com.example.azuredep.controller;

import java.net.http.HttpRequest;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpUtils;

import org.apache.catalina.connector.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import AppResponse.CustomResponse;

@Controller
public class ApplicationController {
	
	
	
	@GetMapping("/")
	@ResponseBody
	public  CustomResponse<String> direct(HttpServletRequest request) {
		
		CustomResponse<String> customResponse = new CustomResponse<String>();
		
		customResponse.setResponseCode(Response.SC_OK);
		customResponse.setMessage("Hello World "+ request.getRemoteAddr());
		
		
		return customResponse;
	}

	
	@GetMapping("/hello")
	@ResponseBody
	public  CustomResponse<String> getHelloMessage(HttpServletRequest request) {
		
		CustomResponse<String> customResponse = new CustomResponse<String>();
		
		Logger.getGlobal().info("IP:"+ request.getRemoteAddr());
		
		
	
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
