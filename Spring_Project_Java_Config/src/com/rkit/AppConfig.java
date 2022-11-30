package com.rkit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//This class is replacement for XML
@Configuration
@ImportResource("app-config.xml")
public class AppConfig {
	@Bean
	X x() {
		return new X(y(),"AppConfigString");   
	}
	
	Y y() {                 
	   return new Y(new Z());          
                             
	}
	
}
