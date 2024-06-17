package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/controller1")
public class FirstWebController {
	
//	@RequestMapping("/home")
//	public ModelAndView controller1() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", "Alexa");
//		mv.setViewName("welcome");
//		return mv;
//	}
	

	@PostMapping("/home")
	public String displayMessage(Model model)    // behind the scene spring injects the implementation of Model the implementing class is BindingAwareModelMap
	{
	model.addAttribute("name", "1st controller home page");

	return "index";   //jsp file name should be welcome.jsp
	}
	}
	

