package com.Property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext at=new ClassPathXmlApplicationContext("property.xml");
	Student stu=(Student) at.getBean("student");
	stu.display();
}
}
