package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller 

public class HelloController{
	
	 	    
   @RequestMapping(value="/hello")
   public ModelAndView helloWorld() {  
	   System.out.println("hi git");
       String message = "HELLO SPRING MVC HOW R U";  
       return new ModelAndView("hello", "message", message);  
   }  

}