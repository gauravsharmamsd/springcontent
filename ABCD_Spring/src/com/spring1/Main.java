package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("test2.xml");
		Test t=(Test) springContainer.getBean("test");
		t.x();
		System.out.println(t.x());

	}

}
