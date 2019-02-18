package com.chegus.microservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MastersController {
	
	@RequestMapping("/")
	public String test() {
		return "index";
	}
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView modelAndView = new ModelAndView("index.jsp");
		
		return modelAndView;
	}
}
