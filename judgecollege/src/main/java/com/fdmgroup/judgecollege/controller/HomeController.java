package com.fdmgroup.judgecollege.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("greeting", "Hello World");
		model.addAttribute("tagline", "Welcome to Judge College");
		return "index";
	}

}
