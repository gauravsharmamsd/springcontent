package com.selexp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.selex.controller")
public class LoveCalculatorAppConfig {
	@Bean
	public InternalResourceViewResolver viewResolver(){
		
	 InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
	 internalResourceViewResolver.setPrefix("/WEB-INF/view/");
	 internalResourceViewResolver.setSuffix(".jsp");
	 return internalResourceViewResolver;
 }
}
