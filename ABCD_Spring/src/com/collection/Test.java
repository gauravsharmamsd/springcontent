package com.collection;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Employee;

public class Test {
	public static void main(String[] args) {
		
	
	ApplicationContext springContainer = new ClassPathXmlApplicationContext("coll.xml");
	
	DataStorer ds=(DataStorer) springContainer.getBean("data");
	DataStorer sd=(DataStorer) springContainer.getBean("data");
	System.out.println(ds.getList()+" "+sd.getList());
	System.out.println(ds.getSet()+"  "+sd.getSet());
	System.out.println(ds.getMap()+"  "+sd.getMap());
	if(ds==sd) {
		System.out.println("Same object...");
	}
	else {
		System.out.println("Different object");
	}
}}