package com.Autowiring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("autoWiring.xml");
	A c =(A) ac.getBean("abc");
//	B b =new B();
//	A a=new A(b);
	c.m1();
	
}
}
