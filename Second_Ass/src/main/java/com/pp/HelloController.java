package com.pp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/*")
public class HelloController {
	
	@RequestMapping("/")
	public String sayHello(){
		return "hello";
	}
//	@RequestMapping("/namaste/{name}")
//	public String showCustomer(@PathVariable("name") String name, Model model) {

	@RequestMapping("/namaste")
	public String showCustomer(@RequestParam("name") String name, Model model) {
	
		System.out.println(name);
           
			model.addAttribute("name", name);
		
		return "namaste";

	}
}
