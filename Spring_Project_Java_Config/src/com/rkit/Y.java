package com.rkit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Y {
	Z z ;
	@Autowired
	Y(Z z){
		System.out.println("Y created ..");
	}
	
}
