package com.fdmgroup.judgecollege.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddUserController {
	
	@RequestMapping("/add-user")
	public String addUser(){
		return "addUser";
	}

}
