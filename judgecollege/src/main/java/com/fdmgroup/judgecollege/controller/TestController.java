package com.fdmgroup.judgecollege.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fdmgroup.judgecollege.service.UserService;

@RestController
public class TestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/test")
	private String test(){
		return "Test";
	}
	
	@RequestMapping("/users")
	public String allUsers(){
		return userService.findAll().toString();
		
	}

}
