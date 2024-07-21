package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	
	@RequestMapping("/")
	public String mainPage() {
		return "main";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
}
