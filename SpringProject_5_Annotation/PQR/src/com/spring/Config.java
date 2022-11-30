package com.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration("config")
@Scope("singleton")
public class Config {

	public void A() {
		System.out.println("All running fine");
		
	}

}
