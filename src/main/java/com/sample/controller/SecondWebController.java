package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/controller2")
public class SecondWebController {
	
	
	@GetMapping("/home")
	public String displayMessage(Model model)    // behind the scene spring injects the implementation of Model the implementing class is BindingAwareModelMap
	{
	model.addAttribute("name", "2nd controller Home page");

	return "index";   //jsp file name should be welcome.jsp
	}
	}


