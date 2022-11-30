package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeup() {
		return "makup kit is ready now......";
		
	}
	@ResponseBody
	@RequestMapping("/book")
	public String getBook() {
		System.out.println("getBook method");
		return "math.....book......";
		
	}

}
