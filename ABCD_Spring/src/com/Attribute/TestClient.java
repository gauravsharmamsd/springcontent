package com.Attribute;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String[] args) {
		
	
ApplicationContext ct=new ClassPathXmlApplicationContext("ant.xml");
TestData t=(TestData) ct.getBean("testData");
t.wish();

}
}