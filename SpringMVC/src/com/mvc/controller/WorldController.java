package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class WorldController
{
	@RequestMapping(value="/welcome")
	   public ModelAndView helloWorld() {  
	       String message = "Welcome to Spring MVC";  
	       return new ModelAndView("welcome", "message", message);  
	   }  
}