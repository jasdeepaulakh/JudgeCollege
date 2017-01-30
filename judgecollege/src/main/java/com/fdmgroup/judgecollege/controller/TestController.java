package com.fdmgroup.judgecollege.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fdmgroup.judgecollege.entity.User;
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
	
	@GetMapping("/save-user")
	public String addUser(@RequestParam String email, @RequestParam String password ){
		User user = new User(email,password,"James", "Arthur", "M", new Date());
		userService.add(user);
		return "Task saved";
	}

}
