package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model){
		model.addAttribute("greeting","Welcome to webstore !");
		model.addAttribute("tagline", "The one and only amazing web store.");
		
		return "welcome";
		
	}
	
}
