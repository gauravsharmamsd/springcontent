package com.selex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
	
	@RequestMapping("/tests")
	public String sayHello() {
		return "helloworld";
		
	}
	@ResponseBody
	@GetMapping("/bye")
	public String bye() {
		return "bye bye guys!!";
	}


}
