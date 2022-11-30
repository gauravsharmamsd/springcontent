package com.rkit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/")
public class HelloController {
	
	@RequestMapping("/hello")
   public String sayHello(@RequestParam("name") String name) {
		System.out.println("sayHello to "+name);
	   return "hello";
   }
	@RequestMapping("/namaste")
	   public String say() {
			System.out.println("Namaste Called");
		   return "namaste";
	   }
}
