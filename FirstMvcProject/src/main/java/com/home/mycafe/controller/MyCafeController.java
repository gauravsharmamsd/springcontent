package com.home.mycafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {

	@RequestMapping("/cafe")

public String showWelcomePage(Model model) {
		//sending data to view(html)
//		String myName="Maahi Gaurav Kaushik";
//		model.addAttribute("pp", myName);
		model.addAttribute("myWebsiteTitle", "MOM'S CAFE Namaste...");
	return "welcome-page";
}
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request,Model model) {
		
		String userEnteredValue =request.getParameter("foodType");
		//add value to model
		model.addAttribute("userInput", userEnteredValue);
		return "process-order";
	}
	
	
	
}
