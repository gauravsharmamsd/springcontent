package com.Autowiring;

import org.springframework.stereotype.Component;

@Component
public class B {
public void m() {
	System.out.println("b method called");
}public B() {
	System.out.println("default of b");
}
}
