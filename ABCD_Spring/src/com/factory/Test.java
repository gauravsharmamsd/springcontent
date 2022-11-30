package com.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
ApplicationContext springContainer = new ClassPathXmlApplicationContext("fact.xml");
	while(true) {
OS os=(OS) springContainer.getBean("obj");
os.spec();
	}

//	OperatingFactory op =new OperatingFactory();
//	OS obj=op.getInstance("Window");
////OS obj=new Window();
//obj.spec();
}
}
