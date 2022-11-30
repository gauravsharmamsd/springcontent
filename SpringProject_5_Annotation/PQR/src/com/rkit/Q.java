package com.rkit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Q {
	R r;
	@Autowired
	Q(R r){
		this.r = r;
		System.out.println("Q Created");
	}

}
