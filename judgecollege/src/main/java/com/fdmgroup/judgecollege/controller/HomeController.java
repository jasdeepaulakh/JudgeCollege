package com.fdmgroup.judgecollege.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.judgecollege.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("greeting", "Hello World");
		model.addAttribute("tagline", "Welcome to Judge College");
		return "index";
	}

}
