package com.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.Scope;

@Configuration()
@ComponentScan(basePackages = "com.Config")

public class Configs {

	@Bean(name="obj")
	public A getInstance() {
		
		A c=new A(getInstanceI());
		A s=new A(getInstanceIy());
		c.setB(getInstanceB());
		
		
		return c;
	}
	@Bean
	public B getInstanceB() {
		return new B();
	}
	@Bean
	public I getInstanceI() {
		return new X();
	}
@Bean
	public I getInstanceIy() {
		return new Y();
	}
//	@Bean
//	public I getInstanceI() {
//		return new Y();
//	}



}
