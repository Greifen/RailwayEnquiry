package com.codeworld.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RailwayEnquiryController {
	
	@RequestMapping("/home")
	public String displayHomePage() {
		return "Welcome to railways!!";
	}
}