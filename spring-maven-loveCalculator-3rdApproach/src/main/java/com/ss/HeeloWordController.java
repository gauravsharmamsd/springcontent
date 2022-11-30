package com.ss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeeloWordController {
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "hello-world";
	}
	@ResponseBody
	@GetMapping("/hello")
	public String hello() {
		return "hello from Maahi Gaurav Kaushik...";
	}
	@ResponseBody
	@GetMapping("/bye")
	public String bye() {
		return "bye bye guys!!";
	}

}
