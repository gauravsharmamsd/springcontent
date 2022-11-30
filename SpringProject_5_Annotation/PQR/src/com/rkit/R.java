package com.rkit;
import org.springframework.stereotype.Component;

@Component
public class R {
	
	R(){
		System.out.println("R created");
	}

}
/*<bean id="r" class="R></bean> */