package com.example.azuredep.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class ApplicationController {
	
	
	
	@GetMapping("/")
	public String homepage() {
		return "hello";
	}
	

	
	
	
	

}
