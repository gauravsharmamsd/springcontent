package com.worldline;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("spring-config.xml");
		/*A a = (A)springContainer.getBean("a2");
		String s = a.getS();
		System.out.println(s);
		B b = a.getB();
	
		System.out.println("str in B is "+b.getStr());
		*/
		System.out.println("I am sure all objects are already created . Now its only returning ref");
		A a1 = (A)springContainer.getBean("a2");//This code is not creating Object
		System.out.println(a1.getB().getStr());
	}

}
