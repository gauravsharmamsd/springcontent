package com.example.worldline_spring_boot_practice;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;

@Component
public class A {
	A(){
		System.out.println("A created");
	}
	A(int i){
		DataSourceTransactionManager mgr;
		System.out.println("A i = "+i);
	}

}
