package springmvc01;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class MyController {

	private List<Customer> customers = Arrays.asList(new Customer("Gaurav","Kanke",1),
			new Customer("Akshay", "Pune", 2));
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("We are in sayhello ");
		return "hello";
	}
	@RequestMapping("/customers/{custId}")
	public String showCustomer(@PathVariable("custId")int id, Model model) {
		Customer c=searchCustomer(id);
		String customerDetail = c.toString();
		model.addAttribute("customer", customerDetail);
		return "customer";
	}
	private Customer searchCustomer(int id) {
		for(Customer c : customers) {
			if(c.getId()==id) {
				return c;
			}
			return null;
		}
		return null;
	}
}
