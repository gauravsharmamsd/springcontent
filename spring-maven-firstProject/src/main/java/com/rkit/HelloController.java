package com.rkit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {
	Customer c1 = new Customer("MsDhoni", "Chennai", 7);
	Customer c2 = new Customer("KLRahul", "Lucknow", 1);
	Customer c3 = new Customer("Virat", "Bengaluru", 18);
	Customer c4 = new Customer("Rishabh", "Delhi", 17);
	List<Customer> list = new ArrayList<>();

	
	@RequestMapping("/hello")
	public String sayHello(@RequestParam("name") String name, Model model) {
		System.out.println("sayHello to " + name);
		model.addAttribute("customer", name);
		return "hello";
	}

	@RequestMapping("/customers/{custID}")
	public String showCustomer(@PathVariable("custID") int id, Model model) {
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);

		Customer c = searchCustomer(id);
		if (c != null) {
			 System.out.println("inside sc-----------"+list);
			String customerDetails = c.toString();
			model.addAttribute("customer", customerDetails);
		} else {
			String str = "notFound";
			model.addAttribute("customer", str);
		}
		return "customer";

	}

	private Customer searchCustomer(int id) {
		// System.out.println(list);
		for (Customer c : list) {
			if (c.getId() == id) {
				// System.out.println("inside c............."+c);
				return c;
			}
		}
		return null;
	}

	@RequestMapping("/namaste")
	public String say() {
		System.out.println("Namaste Called");
		return "namaste";
	}
}
